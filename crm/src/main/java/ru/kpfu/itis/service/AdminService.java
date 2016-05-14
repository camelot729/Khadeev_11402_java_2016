package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.AdminEntity;
import ru.kpfu.itis.form.RegistrationForm;

/**
 * Created by Kamil on 05.05.16.
 */
public interface AdminService  {
    AdminEntity getAdminEntityById(Integer id);
    void saveNewStaff(RegistrationForm form);
}
