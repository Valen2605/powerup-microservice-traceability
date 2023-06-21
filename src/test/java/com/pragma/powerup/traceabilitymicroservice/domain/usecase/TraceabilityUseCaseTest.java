package com.pragma.powerup.traceabilitymicroservice.domain.usecase;

import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class TraceabilityUseCaseTest {

    @Mock
    private ITraceabilityPersistencePort traceabilityPersistencePort;

    private ITraceabilityServicePort traceabilityServicePort;
    @BeforeEach
    void setUp() {
        traceabilityServicePort = new TraceabilityUseCase(traceabilityPersistencePort);
    }



    @Test
    void testSaveTraceability() {
        // Arrange
        Traceability traceability = new Traceability("123456", "10", "54", "email@gmail.com", LocalDateTime.now(), "PENDIENTE","PREPARACION","54", "email@gmail.com");

        // Act
        traceabilityServicePort.saveTraceability(traceability);

    }


    @Test
    void testGetAllRecordsByClient() {
        // Arrange
        String idClient = "123456";
        List<Traceability> expectedTraceability = new ArrayList<>();
        // Add expected records to the list

        when(traceabilityPersistencePort.getTraceability(idClient)).thenReturn(expectedTraceability);

        // Act
        List<Traceability> actualTraceability = traceabilityServicePort.getTraceability(idClient);

        // Assert
        assertEquals(expectedTraceability, actualTraceability);
        verify(traceabilityPersistencePort, times(1)).getTraceability(idClient);
    }

}