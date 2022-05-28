package com.jamesmcgarr.insurancepolicy.services;

import org.springframework.stereotype.Service;

@Service
public interface SmsService {

    void sendSms(String phoneNumber, String message);
}
