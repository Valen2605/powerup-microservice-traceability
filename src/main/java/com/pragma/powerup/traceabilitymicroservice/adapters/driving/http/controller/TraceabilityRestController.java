package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.controller;


import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.traceabilitymicroservice.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
@SecurityRequirement(name = "jwt")
public class TraceabilityRestController {

    private final ITraceabilityHandler traceabilityHandler;

    @Operation(summary = "Add a new Traceability",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Traceability created",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "409", description = "Traceability already exists",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
            })
    @PostMapping("/createTraceability")
    public ResponseEntity<Map<String, String>> saveTraceability(@Valid @RequestBody TraceabilityDto traceabilityDto){
        traceabilityHandler.saveTraceability(traceabilityDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.TRACEABILITY_CREATED_MESSAGE));
    }

    @Operation(summary = "Get Traceability",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Info Traceability",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "404", description = "Traceability not found ",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
            })
    @GetMapping("/traceability")
    public ResponseEntity<List<TraceabilityDto>> getTraceability(@RequestParam String idClient) {

        return ResponseEntity.ok(traceabilityHandler.getTraceability(idClient));
    }
}
