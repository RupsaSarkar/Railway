package com.railway.passenger.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.railway.passenger.model.Passenger;
@Repository
public interface PassengerRepository extends MongoRepository<Passenger,String>{
	  @Query("{ 'ContactNo' : ?0 }")
	  Optional<Passenger> findByContactNo(String ContactNo);

}
