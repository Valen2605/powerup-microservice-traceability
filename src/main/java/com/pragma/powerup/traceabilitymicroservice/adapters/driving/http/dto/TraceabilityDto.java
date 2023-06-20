package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(description = "TraceabilityDto")
public class TraceabilityDto {


    private String idOrder;
    private String idClient;
    private String emailClient;
    @JsonIgnore
    private LocalDateTime date;
    private String previousStatus;
    private String newStatus;
    private String idEmployee;
    private String emailEmployee;
}
