package com.railway.passenger.resource;

import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.railway.passenger.model.Passenger;
import com.railway.passenger.repository.PassengerRepository;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerRepository passengerrepository;
	
	@PostMapping("/addPassenger")
	public String addPassenger (@RequestBody Passenger passenger) {
		passengerrepository.save(passenger);
		return "Passenger registered";
	}
	
	@GetMapping("/findAllPassengers")
	public List<Passenger> getPassenger(){
		return passengerrepository.findAll();
	}
	
	@GetMapping("/findAllPassengers/{contact}")
	public Optional<Passenger> getPassenger(@PathVariable String contact){
		Optional<Passenger> passenger = passengerrepository.findByContactNo(contact);
		return Optional.ofNullable(passenger.orElseThrow(() ->new RuntimeException("Passenger Not Found!")));
	}

}
