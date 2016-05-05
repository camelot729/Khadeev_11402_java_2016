package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.repository.StaffRepository;
import ru.kpfu.itis.service.StaffService;
import ru.kpfu.itis.util.StaffRegFormToUserTransformer;

import java.util.List;

/**
 * Created by Kamil on 15.04.16.
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffRepository staffRepository;

    @Override
    public List<StaffEntity> getAllClients(){
        return staffRepository.findAll();
    }

    @Override
    public StaffEntity getStaffEntityById(Integer id) {
        return staffRepository.findOneById(id);
    }

    @Override
    public void saveNewClient(RegistrationForm form) {
        StaffEntity staffEntity = StaffRegFormToUserTransformer.transform(form);
        staffRepository.save(staffEntity);
    }
}
