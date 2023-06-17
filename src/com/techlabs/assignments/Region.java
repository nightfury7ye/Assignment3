package com.techlabs.assignments;

public class Region {
	int regionID;
	String regionName;
	public Region(int regionID, String regionName) {
		super();
		this.regionID = regionID;
		this.regionName = regionName;
	}
	public Region() {
		super();
	}
	public int getRegionID() {
		return regionID;
	}
	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	@Override
	public String toString() {
		return "Region [regionID=" + regionID + ", regionName=" + regionName + "]";
	}
	
}
