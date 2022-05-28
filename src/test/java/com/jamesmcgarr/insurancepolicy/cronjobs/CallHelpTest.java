package com.jamesmcgarr.insurancepolicy.cronjobs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CallHelpTest {

    private CallHelp callHelp;

    @BeforeEach
    public void before() {
        callHelp = new CallHelp();
    }

    @Test
    public void testCallHelp() {
        callHelp.sendHelpMessage();
    }
}
