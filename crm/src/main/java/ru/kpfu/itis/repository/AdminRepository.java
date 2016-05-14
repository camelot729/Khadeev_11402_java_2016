package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.AdminEntity;

/**
 * Created by Kamil on 04.05.16.
 */
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

    AdminEntity findOneByLogin(String login);

    AdminEntity findOneById(Integer id);
}
