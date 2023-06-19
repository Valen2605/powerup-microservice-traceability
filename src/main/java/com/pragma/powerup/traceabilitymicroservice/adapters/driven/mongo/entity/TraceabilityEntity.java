package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mongo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "traceability")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TraceabilityEntity {
    @Id
    private String id;
    @Field("id_order")
    private String idOrder;
    @Field("id_client")
    private String idClient;
    @Field("email_client")
    private String emailClient;
    @Field("date")
    private LocalDateTime date;
    @Field("previous_status")
    private String previousStatus;
    @Field("new_status")
    private String newStatus;
    @Field("id_employee")
    private String idEmployee;
    @Field("email_employee")
    private String emailEmployee;



}
