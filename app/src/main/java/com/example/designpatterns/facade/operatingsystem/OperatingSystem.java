package com.example.designpatterns.facade.operatingsystem;

//Facade class
public class OperatingSystem {
    private FileManager fileManager;
    private MemoryManager memoryManager;
    private ProcessManager processManager;

    public OperatingSystem() {
        fileManager = new FileManager();
        memoryManager = new MemoryManager();
        processManager = new ProcessManager();
    }

    public void createFile(String fileName) {
        fileManager.createFile(fileName);
    }

    public void deleteFile(String fileName) {
        fileManager.deleteFile(fileName);
    }

    public void allocateMemory(int size) {
        memoryManager.allocateMemory(size);
    }

    public void deallocateMemory(int size) {
        memoryManager.deallocateMemory(size);
    }

    public void startProcess(String processName) {
        processManager.startProcess(processName);
    }

    public void stopProcess(String processName) {
        processManager.stopProcess(processName);
    }
}
