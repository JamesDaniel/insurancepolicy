package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.model.AliveEvent;

public interface AliveEventRepository {

    void save(AliveEvent aliveEvent);
}
