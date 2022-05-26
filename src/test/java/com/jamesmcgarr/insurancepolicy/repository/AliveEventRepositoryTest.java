package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.model.AliveEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AliveEventRepositoryTest {

    @Autowired
    public AliveEventRepository aliveEventRepository;

    @Test
    public void testAliveEventRepository() {
        aliveEventRepository.save(new AliveEvent());
    }
}
