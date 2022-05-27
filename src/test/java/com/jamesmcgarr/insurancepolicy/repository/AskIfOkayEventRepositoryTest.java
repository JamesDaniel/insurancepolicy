package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.model.AskIfOkayEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AskIfOkayEventRepositoryTest {

    @Autowired
    public AskIfOkayEventRepository askIfOkayEventRepository;

    @Test
    public void testAliveEventRepository() {
        askIfOkayEventRepository.save(new AskIfOkayEvent());
    }
}
