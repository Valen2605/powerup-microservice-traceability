package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.mapper.ITraceabilityRequestMapper;
import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TraceabilityHandlerImp implements ITraceabilityHandler {

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;

    @Override
    public void saveTraceability(TraceabilityDto traceabilityDto) {
        traceabilityServicePort.saveTraceability(traceabilityRequestMapper.toTraceability(traceabilityDto));
    }

    @Override
    public List<TraceabilityDto> getTraceability(String idClient) {
        return traceabilityRequestMapper.toTraceabilityDtoList(traceabilityServicePort.getTraceability(idClient));
    }
}
