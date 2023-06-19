package com.pragma.powerup.traceabilitymicroservice.configuration;



import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.adapter.TraceabilityMongoAdapter;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.mappers.ITraceabilityEntityMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.repositories.ITraceabilityRepository;
import com.pragma.powerup.traceabilitymicroservice.domain.api.*;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.*;
import com.pragma.powerup.traceabilitymicroservice.domain.usecase.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Bean
    public ITraceabilityServicePort traceabilityServicePort() {
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort() {
        return new TraceabilityMongoAdapter(traceabilityRepository, traceabilityEntityMapper);
    }

}
