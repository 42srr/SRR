package com.ggs.srr.domain.group;

import com.ggs.srr.domain.reservation.Reservation;
import com.ggs.srr.domain.usergroup.UserGroup;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;

    private String groupName;

    private LocalDateTime createdDateTime;

    private LocalDateTime modifiedDateTime;

    @OneToMany(mappedBy = "group")
    private List<UserGroup> userGroups = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<Reservation> reservations = new ArrayList<>();

}
