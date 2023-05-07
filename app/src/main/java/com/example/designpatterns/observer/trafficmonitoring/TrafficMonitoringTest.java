package com.example.designpatterns.observer.trafficmonitoring;

public class TrafficMonitoringTest {
    public static void main(String[] args) {
        TrafficMonitoringSystem trafficMonitoringSystem = new TrafficMonitoringSystem();
        TrafficController controller1 = new TrafficController("Controller 1", trafficMonitoringSystem);
        TrafficController controller2 = new TrafficController("Controller 2", trafficMonitoringSystem);


        trafficMonitoringSystem.setMeasurements(100, 50);

        trafficMonitoringSystem.setMeasurements(50, 70);

        trafficMonitoringSystem.removeTrafficObserver(controller1);

        trafficMonitoringSystem.setMeasurements(4, 100.5f);

    }
}
