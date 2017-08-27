package com.theironyard.java.telematicsproject;

public class VehicleInfo {
    private int VIN;
    private double odometer; //total miles traveled
    private double consumption; //gallons of gas consumed
    private double lastOilChng; //odometer reading for last oil change
    private double engineSize; //engine size in liters

    public VehicleInfo() {
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getLastOilChng() {
        return lastOilChng;
    }

    public void setLastOilChng(double lastOilChng) {
        this.lastOilChng = lastOilChng;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
