package ru.kpfu.itis.entity;

import javax.persistence.*;

@Entity
@Table(name = "staff_interval")
public class StaffProfileInterval {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id")
    private StaffProfileEntity staffProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interval_id")
    private Shedule interval;

    public StaffProfileInterval() {
    }

    public StaffProfileInterval(StaffProfileEntity staffProfile, Shedule interval) {
        this.staffProfile = staffProfile;
        this.interval = interval;
    }

    public StaffProfileEntity getInstructorProfile() {
        return staffProfile;
    }

    public void setInstructorProfile(StaffProfileEntity staffProfile) {
        this.staffProfile = staffProfile;
    }

    public Shedule getInterval() {
        return interval;
    }

    public void setInterval(Shedule interval) {
        this.interval = interval;
    }
}
