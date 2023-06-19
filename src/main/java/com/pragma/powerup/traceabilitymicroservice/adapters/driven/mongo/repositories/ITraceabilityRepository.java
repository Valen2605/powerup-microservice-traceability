package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.repositories;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, String> {
    List<TraceabilityEntity> findAllByIdClient(String idClient);

}
