package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.AdminEntity;

/**
 * Created by Kamil on 04.05.16.
 */
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

    AdminEntity findOneByLogin(String login);

    AdminEntity findOneById(Integer id);
}
