package com.example.designpatterns.facade.operatingsystem;

public class MemoryManager {
    public void allocateMemory(int size) {
        System.out.println("Memory allocated: " + size + " KB");
    }

    public void deallocateMemory(int size) {
        System.out.println("Memory deallocated: " + size + " KB");
    }
}
