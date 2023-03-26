package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() { // we put a non-argument constructor also so that we don't have to give value every constant
    }
}
