package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.UsersEntity;

/**
 * Created by Kamil on 04.05.16.
 */
public interface UserRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findOneByLogin(String login);

    UsersEntity findOneById(Integer id);

}
