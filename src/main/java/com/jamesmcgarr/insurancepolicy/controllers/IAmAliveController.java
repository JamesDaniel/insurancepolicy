package com.jamesmcgarr.insurancepolicy.controllers;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import com.jamesmcgarr.insurancepolicy.services.AliveStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class IAmAliveController {

    private final AliveStatusService aliveStatusService;

    @PostMapping(value = "/iamalive", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void iAmAlive(@RequestBody AliveEvent aliveEvent) {
        AliveEvent aliveEvent1 = new AliveEvent();
        aliveEvent1.setUsername(aliveEvent.getUsername());
        aliveStatusService.iAmAlive(aliveEvent1);
    }

    @GetMapping(value = "/status/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AliveEvent amIAlive(@PathVariable String username) {
        AliveEvent aliveEvent = new AliveEvent();
        aliveEvent.setUsername(username);
        return aliveStatusService.amIAlive(aliveEvent);
    }
}
