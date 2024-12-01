package com.ggs.srr.domain.studyroom;

import com.ggs.srr.domain.reservation.Reservation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudyRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "study_room_id")
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Location location;

    private LocalTime openTime;

    private LocalTime closeTime;

    @OneToMany(mappedBy = "studyRoom")
    private List<Reservation> reservations = new ArrayList<>();
}
