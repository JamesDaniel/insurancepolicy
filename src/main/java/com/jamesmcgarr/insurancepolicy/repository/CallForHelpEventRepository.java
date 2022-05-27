package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.model.CallForHelpEvent;

public interface CallForHelpEventRepository {
    void save(CallForHelpEvent callForHelpEvent);
}
