package ru.kpfu.itis.service.impl;

import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.Shedule;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.entity.StaffProfileInterval;
import ru.kpfu.itis.entity.enums.Period;
import ru.kpfu.itis.entity.enums.Status;
import ru.kpfu.itis.repository.SheduleRepository;
import ru.kpfu.itis.repository.StaffSheduleRepository;
import ru.kpfu.itis.repository.impl.SheduleRepositoryImpl;
import ru.kpfu.itis.service.SheduleService;
import ru.kpfu.itis.service.StaffProfileService;
import ru.kpfu.itis.service.StaffService;
import ru.kpfu.itis.service.StaffShedulelService;

import java.time.DayOfWeek;
import java.util.List;

/**
 * Created by Kamil on 14.05.16.
 */

@Service
public class SheduleServiseImpl implements SheduleService {

    @Autowired
    SheduleRepositoryImpl sheduleRepositoryImpl;

    @Autowired
    SheduleRepository sheduleRepository;

    @Autowired
    StaffProfileService staffProfileService;

    @Autowired
    StaffService staffService;

    @Autowired
    StaffSheduleRepository staffSheduleRepository;



    @Override
    public List getIntervalsByStaffId(Integer id) {
        StaffProfileEntity profileEntity = staffProfileService.getStaffProfileEntityByStaffEntity(staffService.getStaffEntityById(id));
        return sheduleRepositoryImpl.getIntervalsByStaffId(profileEntity.getId());
    }

    @Override
    public List<String> getIntervalsByStaffAndDayOfWeek(Integer id, String day) {
        return sheduleRepositoryImpl.getIntervalsByStaffAndDayOfWeek(id,day);
    }

    @Override
    public List findAll() {
        return sheduleRepositoryImpl.getAllBusyIntervals();
    }

    @Override
    public void saveNewInterval(String day, String period, Integer staffId) {
        Shedule interval = new Shedule();
        interval.setDayOfWeek(DayOfWeek.valueOf(day));
        interval.setPeriod(Period.valueOf(period));
        interval.setStatus(Status.EMPTY);
        sheduleRepository.save(interval);

        StaffProfileInterval staffProfileInterval = new StaffProfileInterval();
        StaffEntity staffEntity = staffService.getStaffEntityById(staffId);
        StaffProfileEntity profileEntity = staffProfileService.getStaffProfileEntityByStaffEntity(staffEntity);
        staffProfileInterval.setInstructorProfile(profileEntity);
        staffProfileInterval.setInterval(interval);
        staffSheduleRepository.save(staffProfileInterval);
    }
}
