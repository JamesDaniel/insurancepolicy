package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.entity.AskIfOkayEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AskIfOkayEventRepositoryTest {

    @Autowired
    public AskIfOkayEventRepository askIfOkayEventRepository;

    @Test
    public void testAliveEventRepository() {
        askIfOkayEventRepository.save(new AskIfOkayEvent());
    }
}
