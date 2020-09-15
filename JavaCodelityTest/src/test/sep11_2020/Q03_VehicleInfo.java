package test.sep11_2020;

import java.util.Comparator;

public class Q03_VehicleInfo implements Comparator<Q03_VehicleInfo>{
private String vehicleNumber;
public Q03_VehicleInfo(String vehicleNumber, String model, int minutes) {
	super();
	this.vehicleNumber = vehicleNumber;
	this.model = model;
	this.minutes = minutes;
}
public Q03_VehicleInfo() {
	
}
@Override
public String toString() {
	return "VehicleInfo [vehicleNumber=" + vehicleNumber + ", model=" + model + ", minutes=" + minutes + "]";
}
private String model;
private int minutes;

public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getMinutes() {
	return minutes;
}
public void setMinutes(int minutes) {
	this.minutes = minutes;
}


@Override
public int compare(Q03_VehicleInfo v1, Q03_VehicleInfo v2) {
	// TODO Auto-generated method stub
	return v1.minutes-v2.minutes;

}
}