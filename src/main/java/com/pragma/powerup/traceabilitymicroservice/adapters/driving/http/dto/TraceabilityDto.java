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

    @NotEmpty(message = "The idOrder must not be empty")
    private String idOrder;
    @NotEmpty(message = "The idClient must not be empty")
    private String idClient;
    @NotEmpty(message = "The email client must not be empty")
    private String emailClient;
    @JsonIgnore
    private LocalDateTime date;
    @NotEmpty(message = "The previous status must not be empty")
    private String previousStatus;
    @NotEmpty(message = "The new status must not be empty")
    private String newStatus;
    @NotEmpty(message = "The idEmployee must not be empty")
    private String idEmployee;
    @NotEmpty(message = "The email employee must not be empty")
    private String emailEmployee;
}
