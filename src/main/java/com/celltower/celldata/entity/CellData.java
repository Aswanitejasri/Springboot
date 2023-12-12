package com.celltower.celldata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CellData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int signalStrength;
    private String networkType;
    private String cellId;
    private String tac;
    private String mcc;
    private String mnc;
    private String OperatorName;
    private double latitude;
    private double longitude;
    private String readableAddress;
    private String date;
    private String time;
    private String deviceName;
    private String androidId;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getSignalStrength() {
        return signalStrength;
    }
    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }
    public String getNetworkType() {
        return networkType;
    }
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }
    public String getCellId() {
        return cellId;
    }
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }
    public String getTac() {
        return tac;
    }
    public void setTac(String tac) {
        this.tac = tac;
    }
    public String getMcc() {
        return mcc;
    }
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }
    public String getMnc() {
        return mnc;
    }
    public void setMnc(String mnc) {
        this.mnc = mnc;
    }
    public String getOperatorName() {
        return OperatorName;
    }
    public void setOperatorName(String operatorName) {
        this.OperatorName = operatorName;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public String getReadableAddress() {
        return readableAddress;
    }
    public void setReadableAddress(String readableAddress) {
        this.readableAddress = readableAddress;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getAndroidId() {
        return androidId;
    }
    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }
}
