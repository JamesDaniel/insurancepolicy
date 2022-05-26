package com.jamesmcgarr.insurancepolicy.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SmsServiceTest {

    @Autowired
    private SmsService smsService;

    @Test
    public void testSmsSends() {
        smsService.sendSms("+353098998876", "Check on Peter. He might need help.");
    }
}
