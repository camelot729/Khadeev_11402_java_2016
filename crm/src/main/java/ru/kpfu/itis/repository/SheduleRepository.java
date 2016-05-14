package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.Shedule;

@Repository
public interface SheduleRepository extends JpaRepository<Shedule, Integer>{
}
