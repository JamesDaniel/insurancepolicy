package com.jamesmcgarr.insurancepolicy.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class AliveEvent {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "createTimeStamp")
    @CreationTimestamp
    private LocalDateTime createTimeStamp = LocalDateTime.now();

}
