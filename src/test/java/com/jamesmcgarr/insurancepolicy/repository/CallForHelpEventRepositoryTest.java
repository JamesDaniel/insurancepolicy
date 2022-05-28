package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.entity.CallForHelpEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CallForHelpEventRepositoryTest {

    @Autowired
    public CallForHelpEventRepository callForHelpEventRepository;

    @Test
    public void testAliveEventRepository() {
        callForHelpEventRepository.save(new CallForHelpEvent());
    }
}
