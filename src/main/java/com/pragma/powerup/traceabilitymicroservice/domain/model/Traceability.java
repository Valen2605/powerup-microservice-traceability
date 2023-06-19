package com.pragma.powerup.traceabilitymicroservice.domain.model;

import java.time.LocalDateTime;

public class Traceability {

    private String id;
    private String idOrder;
    private String idClient;
    private String emailClient;
    private LocalDateTime date;
    private String previousStatus;
    private String newStatus;
    private String idEmployee;
    private String emailEmployee;

    public Traceability() {
    }

    public Traceability(String id, String idOrder, String idClient, String emailClient, LocalDateTime date, String previousStatus, String newStatus, String idEmployee, String emailEmployee) {
        this.id = id;
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.emailClient = emailClient;
        this.date = date;
        this.previousStatus = previousStatus;
        this.newStatus = newStatus;
        this.idEmployee = idEmployee;
        this.emailEmployee = emailEmployee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPreviousStatus() {
        return previousStatus;
    }

    public void setPreviousStatus(String previousStatus) {
        this.previousStatus = previousStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }
}
