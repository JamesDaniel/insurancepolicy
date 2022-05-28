package com.jamesmcgarr.insurancepolicy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CallForHelpEvent {

    @Id
    @GeneratedValue
    private Long id;
}
