package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.StaffProfileInterval;

@Repository
public interface StaffSheduleRepository extends JpaRepository<StaffProfileInterval, Integer>{
}
