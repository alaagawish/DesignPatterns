package com.example.designpatterns.facade.operatingsystem;

public class FileManager {

    public void createFile(String fileName) {
        System.out.println("File created: " + fileName);
    }

    public void deleteFile(String fileName) {
        System.out.println("File deleted: " + fileName);
    }

}
