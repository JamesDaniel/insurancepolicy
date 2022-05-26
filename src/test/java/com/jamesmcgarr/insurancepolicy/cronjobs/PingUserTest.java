package com.jamesmcgarr.insurancepolicy.cronjobs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PingUserTest {

    @Autowired
    private PingUser pingUser;

    @Test
    public void testAskUserIfTheyAreOkay() {
        pingUser.askUserIfTheyAreOkay();
    }
}
