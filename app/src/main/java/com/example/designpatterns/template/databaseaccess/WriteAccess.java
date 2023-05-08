package com.example.designpatterns.template.databaseaccess;

public class WriteAccess extends DatabaseAccessTemplate {

    @Override
    protected void performAccess() {
        System.out.println("Performing write access...");
    }
}