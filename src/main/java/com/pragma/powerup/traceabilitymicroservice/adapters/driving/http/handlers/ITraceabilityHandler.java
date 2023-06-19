package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityDto;


public interface ITraceabilityHandler {
    void saveTraceability(TraceabilityDto traceabilityDto);

}
