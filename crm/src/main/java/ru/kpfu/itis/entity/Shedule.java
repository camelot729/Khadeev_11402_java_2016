package ru.kpfu.itis.entity;

import ru.kpfu.itis.entity.enums.Period;
import ru.kpfu.itis.entity.enums.Status;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Table(name = "interval")
public class Shedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "day_of_week")
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @Column(name = "period")
    @Enumerated(EnumType.STRING)
    private Period period;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private StaffEntity clientEntity;

    public StaffEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(StaffEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Shedule() {
    }

    public Shedule(DayOfWeek dayOfWeek, Period period) {
        this.dayOfWeek = dayOfWeek;
        this.period = period;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
