package com.pragma.powerup.traceabilitymicroservice.domain.api;

import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort {
    void  saveTraceability(Traceability traceability);

    List<Traceability> getTraceability(String idClient);
}
