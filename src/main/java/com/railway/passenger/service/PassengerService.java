package com.railway.passenger.service;

import com.railway.passenger.model.PassengerModel;
import com.railway.passenger.mongodb.Passenger;

public interface PassengerService {
	public Passenger addPassenger(PassengerModel passengerDto);
	public Passenger getPassengerByContactNo(String contactNo);
	public Passenger updatePassenger(PassengerModel passengerDto, String contactNo);
	public Passenger deletePassengerByContactNo(String contactNo);

}
