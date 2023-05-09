package com.example.designpatterns.facade.operatingsystem;

public class ProcessManager {
    public void startProcess(String processName) {
        System.out.println("Process started: " + processName);
    }

    public void stopProcess(String processName) {
        System.out.println("Process stopped: " + processName);
    }
}
