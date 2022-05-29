package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AliveEventRepository extends CrudRepository<AliveEvent, Long> {

    Optional<AliveEvent> findFirstByUsernameOrderByCreateTimeStampDesc(String username);

}
