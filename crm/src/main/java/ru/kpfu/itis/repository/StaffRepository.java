package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.StaffEntity;

/**
 * Created by Kamil on 15.04.16.
 */
@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long>{

    StaffEntity findOneByLogin(String login);

    StaffEntity findOneById(Integer id);

}
