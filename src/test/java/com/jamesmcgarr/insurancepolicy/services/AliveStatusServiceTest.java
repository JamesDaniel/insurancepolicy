package com.jamesmcgarr.insurancepolicy.services;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import com.jamesmcgarr.insurancepolicy.exceptions.AliveEventNotFoundException;
import com.jamesmcgarr.insurancepolicy.repository.AliveEventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class AliveStatusServiceTest {

    private AliveStatusService TEST_INSTANCE;

    private AliveEventRepository aliveEventRepository;

    @BeforeEach
    public void before() {
        aliveEventRepository = mock(AliveEventRepository.class);
        TEST_INSTANCE = new AliveStatusService(aliveEventRepository);
    }

    @Test
    public void testIAmAlive() {
        TEST_INSTANCE.iAmAlive(new AliveEvent());
        verify(aliveEventRepository).save(any(AliveEvent.class));
    }

    @Test
    public void testAmIAlive_noEventsFound() {
        AliveEvent aliveEvent = new AliveEvent();
        aliveEvent.setId(-1L);
        aliveEvent.getId();
        aliveEvent.setUsername("johndoe");
        Exception exception = assertThrows(AliveEventNotFoundException.class, () -> {
            TEST_INSTANCE.amIAlive(aliveEvent);
        });
        assertEquals("Alive event not found!", exception.getMessage());

        verify(aliveEventRepository).findFirstByUsernameOrderByCreateTimeStampDesc(any(String.class));
    }

    @Test
    public void testAmIAlive_eventsFound() {
        Optional<AliveEvent> aliveEventOptional = mock(Optional.class);
        AliveEvent aliveEvent1 = mock(AliveEvent.class);
        when(aliveEventOptional.isPresent()).thenReturn(true);
        when(aliveEventOptional.get()).thenReturn(aliveEvent1);
        when(aliveEventRepository.findFirstByUsernameOrderByCreateTimeStampDesc(any(String.class))).thenReturn(aliveEventOptional);

        AliveEvent aliveEvent = new AliveEvent();
        aliveEvent.setId(-1L);
        aliveEvent.getId();
        aliveEvent.setUsername("johndoe");
        TEST_INSTANCE.amIAlive(aliveEvent);

        verify(aliveEventRepository).findFirstByUsernameOrderByCreateTimeStampDesc(any(String.class));
    }
}
