package com.jamesmcgarr.insurancepolicy.services;

import com.jamesmcgarr.insurancepolicy.exceptions.AliveEventNotFoundException;
import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import com.jamesmcgarr.insurancepolicy.repository.AliveEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AliveStatusService {

    private final AliveEventRepository aliveEventRepository;

    public void iAmAlive(AliveEvent aliveEvent) {
        aliveEventRepository.save(aliveEvent);
    }

    public AliveEvent amIAlive(AliveEvent aliveEvent) {
        Optional<AliveEvent> aliveEvent1 = aliveEventRepository.findFirstByUsernameOrderByCreateTimeStampDesc(aliveEvent.getUsername());
        if (aliveEvent1.isPresent()) {
            return aliveEvent1.get();
        }
        throw new AliveEventNotFoundException("Alive event not found!");
    }
}
