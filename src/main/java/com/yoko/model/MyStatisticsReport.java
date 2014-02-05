package com.yoko.model;

import java.util.List;

public class MyStatisticsReport {
	private List<FuelRecord> fuelRecords;
	private float avarageFuelConsume;
	private int currentCarKM;
	
	public List<FuelRecord> getFuelRecords() {
		return fuelRecords;
	}
	public void setFuelRecords(List<FuelRecord> fuelRecords) {
		this.fuelRecords = fuelRecords;
	}
	public float getAvarageFuelConsume() {
		return avarageFuelConsume;
	}
	public void setAvarageFuelConsume(float avarageFuelConsume) {
		this.avarageFuelConsume = avarageFuelConsume;
	}
	public int getCurrentCarKM() {
		return currentCarKM;
	}
	public void setCurrentCarKM(int currentCarKM) {
		this.currentCarKM = currentCarKM;
	}
	
	
}
