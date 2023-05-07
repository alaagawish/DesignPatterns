package com.example.designpatterns.template;

public class ReadAccess extends DatabaseAccessTemplate {

    @Override
    protected void performAccess() {
        System.out.println("Performing read access...");
    }
}



