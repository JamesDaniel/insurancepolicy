package com.jamesmcgarr.insurancepolicy.cronjobs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CallHelpTest {

    @Autowired
    private CallHelp callHelp;

    @Test
    public void testCallHelp() {
        callHelp.sendHelpMessage();
    }
}
