package com.jamesmcgarr.insurancepolicy.repository;

import com.jamesmcgarr.insurancepolicy.entity.AskIfOkayEvent;
import org.springframework.data.repository.CrudRepository;

public interface AskIfOkayEventRepository extends CrudRepository<AskIfOkayEvent, Long> {
}
