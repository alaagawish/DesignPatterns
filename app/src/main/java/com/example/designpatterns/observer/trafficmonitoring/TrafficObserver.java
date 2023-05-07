package com.example.designpatterns.observer.trafficmonitoring;

public interface TrafficObserver {
    void updateTrafficFlow(int vehicleCount, float averageSpeed);
}
