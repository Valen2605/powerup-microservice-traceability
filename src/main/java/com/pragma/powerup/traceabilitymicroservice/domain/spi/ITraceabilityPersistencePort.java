package com.pragma.powerup.traceabilitymicroservice.domain.spi;


import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort {
    void saveTraceability(Traceability traceability);

    List<Traceability> getTraceability(String idClient);

}
