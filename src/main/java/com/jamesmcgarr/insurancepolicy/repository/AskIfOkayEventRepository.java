package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.model.AskIfOkayEvent;

public interface AskIfOkayEventRepository {
    void save(AskIfOkayEvent askIfOkayEvent);
}
