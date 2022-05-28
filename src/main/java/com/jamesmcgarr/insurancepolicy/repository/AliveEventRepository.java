package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import org.springframework.data.repository.CrudRepository;

public interface AliveEventRepository extends CrudRepository<AliveEvent, Long> {

}
