package com.jamesmcgarr.insurancepolicy.cronjobs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PingUserTest {

    private PingUser pingUser;

    @BeforeEach
    public void before() {
        pingUser = new PingUser();
    }

    @Test
    public void testAskUserIfTheyAreOkay() {
        pingUser.askUserIfTheyAreOkay();
    }
}
