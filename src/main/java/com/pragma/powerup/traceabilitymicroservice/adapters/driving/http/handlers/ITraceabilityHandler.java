package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityDto;

import java.util.List;


public interface ITraceabilityHandler {
    void saveTraceability(TraceabilityDto traceabilityDto);

    List<TraceabilityDto> getTraceability(String idClient);

}
