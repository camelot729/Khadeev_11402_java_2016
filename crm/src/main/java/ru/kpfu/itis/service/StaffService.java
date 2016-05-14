package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.RegistrationForm;

import java.util.List;

/**
 * Created by Kamil on 15.04.16.
 */

public interface StaffService {

    List<StaffEntity> getAllClients();

    StaffEntity getStaffEntityById(Integer id);

    void saveNewStaff(RegistrationForm form);
}