package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.AdminEntity;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.repository.AdminRepository;
import ru.kpfu.itis.repository.StaffRepository;
import ru.kpfu.itis.service.AdminService;

/**
 * Created by Kamil on 05.05.16.
 */
@Service
public class AdminEntityImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public AdminEntity getAdminEntityById(Integer id) {
        return adminRepository.findOneById(id);
    }

    @Override
    public void saveNewStaff(RegistrationForm form) {

    }
}
