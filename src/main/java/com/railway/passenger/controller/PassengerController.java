package com.railway.passenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.railway.passenger.model.PassengerModel;
import com.railway.passenger.mongodb.Passenger;
import com.railway.passenger.service.PassengerService;

@RestController
@RequestMapping("/api")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/passenger")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Passenger> addPassenger (@RequestBody PassengerModel passengerDto) {
				return new ResponseEntity<>(passengerService.addPassenger(passengerDto), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/passenger/{contactNo}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Passenger> getPassengerByContactNo(@PathVariable(value = "contactNo") String contactNo){
        return new ResponseEntity<>(passengerService.getPassengerByContactNo(contactNo), HttpStatus.OK);
    }
	

    @PutMapping(value = "/passenger/{contactNo}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Passenger> updatePassenger(@RequestBody PassengerModel passengerDto, @PathVariable(value = "contactNo") String contactNo){
        return new ResponseEntity<>(passengerService.updatePassenger(passengerDto, contactNo), HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/passenger/{contactNo}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Passenger> deletePassengerByContactNo(@PathVariable(value="contactNo") String contactNo){
        return new ResponseEntity<>(passengerService.deletePassengerByContactNo(contactNo), HttpStatus.OK);
    }

}
