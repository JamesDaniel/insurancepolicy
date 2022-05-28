package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AliveEventRepositoryTest {

    @Autowired
    public AliveEventRepository aliveEventRepository;

    @Test
    public void testAliveEventRepository() {
        aliveEventRepository.save(new AliveEvent());
    }
}
