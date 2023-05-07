package com.example.designpatterns.template;

public class WriteAccess extends DatabaseAccessTemplate {

    @Override
    protected void performAccess() {
        System.out.println("Performing write access...");
    }
}