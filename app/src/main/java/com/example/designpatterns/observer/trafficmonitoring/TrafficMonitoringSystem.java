package com.example.designpatterns.observer.trafficmonitoring;

import java.util.ArrayList;
import java.util.List;

public class TrafficMonitoringSystem {

    private List<TrafficObserver> observers = new ArrayList<>();
    private int vehicleCount;
    private float averageSpeed;

    public int getVehicleCount() {
        return vehicleCount;
    }

    public float getAverageSpeed() {
        return averageSpeed;
    }

    public void addTrafficObserver(TrafficObserver observer) {
        observers.add(observer);
    }

    public void removeTrafficObserver(TrafficObserver observer) {
        observers.remove(observer);
    }
    private void notifyTrafficObservers() {
        for (TrafficObserver observer : observers) {
            observer.updateTrafficFlow(vehicleCount, averageSpeed);
        }
    }

    public void setMeasurements(int vehicleCount, float averageSpeed) {
        this.vehicleCount = vehicleCount;
        this.averageSpeed = averageSpeed;

        notifyTrafficObservers();
    }
}
