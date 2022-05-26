package com.jamesmcgarr.insurancepolicy.cronjobs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CallHelpTest {

    @Autowired
    private CallHelp callHelp;

    @Test
    public void testCallHelp() {
        callHelp.sendHelpMessage();
    }
}
