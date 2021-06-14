package com.railway.passenger.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.railway.passenger.model.PassengerModel;
import com.railway.passenger.mongodb.Passenger;
@Repository
public interface PassengerRepository extends MongoRepository<Passenger,String>{
	 Optional<Passenger> findById(String contactNo);

}
