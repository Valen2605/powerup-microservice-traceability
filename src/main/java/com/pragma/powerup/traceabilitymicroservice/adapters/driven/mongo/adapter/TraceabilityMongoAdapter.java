package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.adapter;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.mappers.ITraceabilityEntityMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.repositories.ITraceabilityRepository;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@RequiredArgsConstructor
public class TraceabilityMongoAdapter implements ITraceabilityPersistencePort {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;


    @Override
    public void saveTraceability(Traceability traceability) {
        traceability.setDate(LocalDateTime.now());
        traceabilityRepository.save(traceabilityEntityMapper.toEntity(traceability));
    }
}
