package com.example.designpatterns.facade.operatingsystem;

public class OperatingSystemTest {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem();

        os.createFile("file.txt");
        os.allocateMemory(1024);
        os.startProcess("notepad.exe");



        os.stopProcess("notepad.exe");
        os.deallocateMemory(1024);
        os.deleteFile("file.txt");
    }
}
