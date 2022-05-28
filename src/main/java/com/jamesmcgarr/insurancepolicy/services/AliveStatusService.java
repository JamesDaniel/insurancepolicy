package com.jamesmcgarr.insurancepolicy.services;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import com.jamesmcgarr.insurancepolicy.repository.AliveEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AliveStatusService {

    private final AliveEventRepository aliveEventRepository;

    public void iAmAlive(AliveEvent aliveEvent) {
        aliveEventRepository.save(aliveEvent);
    }

    public AliveEvent amIAlive(AliveEvent aliveEvent) {
        return aliveEventRepository.findFirstByUsernameOrderByCreateTimeStampDesc(aliveEvent.getUsername());
    }
}
