package com.example.designpatterns.observer.trafficmonitoring;

public class TrafficController implements TrafficObserver {
    private String name;
    private TrafficMonitoringSystem trafficMonitoringSystem;

    public TrafficController(String name, TrafficMonitoringSystem trafficMonitoringSystem) {
        this.name = name;
        this.trafficMonitoringSystem = trafficMonitoringSystem;
        trafficMonitoringSystem.addTrafficObserver(this);
    }

    @Override
    public void updateTrafficFlow(int vehicleCount, float averageSpeed) {
        String data = "TrafficFlowData{" +
                "vehicleCount=" + vehicleCount +
                ", averageSpeed=" + averageSpeed +
                '}';
        System.out.println(name + ": Received traffic flow update: " + data);

    }


}
