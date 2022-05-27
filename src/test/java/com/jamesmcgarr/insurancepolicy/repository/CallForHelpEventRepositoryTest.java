package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.model.CallForHelpEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CallForHelpEventRepositoryTest {

    @Autowired
    public CallForHelpEventRepository callForHelpEventRepository;

    @Test
    public void testAliveEventRepository() {
        callForHelpEventRepository.save(new CallForHelpEvent());
    }
}
