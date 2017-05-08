package com.killer.sample.spring.model;

/**
 * Created by app on 4/15/17.
 */
public class Device {

    private String deviceId;
    private String macAddress;

    public Device() {
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getMacAddress() {
        return macAddress;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", macAddress='" + macAddress + '\'' +
                '}';
    }
}
