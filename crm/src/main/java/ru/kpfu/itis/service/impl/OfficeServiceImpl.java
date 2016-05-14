package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.form.OfficeForm;
import ru.kpfu.itis.repository.OfficeRepository;
import ru.kpfu.itis.service.OfficeService;

import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService {


    @Autowired
    OfficeRepository officeRepository;

    @Override
    public Page<OfficeEntity> getAllOffices(PageRequest pageRequest) {
        return officeRepository.findAll(pageRequest);
    }

    @Override
    public OfficeEntity getOfficeById(Integer id) {
        return officeRepository.findOneById(id);
    }

    @Override
    public void saveNewOffice(OfficeForm form) {

    }

}
