package com.example.designpatterns.template.databaseaccess;

public class DatabaseAccessTest {

    public static void main(String[] args) {
        DatabaseAccessTemplate readAccess = new ReadAccess();
        readAccess.accessDatabase();

        DatabaseAccessTemplate writeAccess = new WriteAccess();
        writeAccess.accessDatabase();
    }
}
