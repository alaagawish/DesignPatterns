package com.example.designpatterns.template.databaseaccess;

public abstract class DatabaseAccessTemplate {

    public final void accessDatabase() {
        connectToDatabase();
        performAccess();
        disconnectFromDatabase();
    }

    protected abstract void performAccess();

    protected void connectToDatabase() {
        System.out.println("Connecting to database...");
    }

    protected void disconnectFromDatabase() {
        System.out.println("Disconnecting from database...");
    }
}
