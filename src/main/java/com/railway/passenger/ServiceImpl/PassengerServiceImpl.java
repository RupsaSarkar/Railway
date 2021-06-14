package com.railway.passenger.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.MongoException;
import com.railway.passenger.model.PassengerModel;
import com.railway.passenger.mongodb.Passenger;
import com.railway.passenger.repository.PassengerRepository;
import com.railway.passenger.service.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;

	@Override
	public Passenger addPassenger(PassengerModel passengerDto) {
			if(passengerDto.getContactNo()==null) {
				System.out.println("Invalid registration request!");
			}
				Passenger passenger = new Passenger(passengerDto.getId(), passengerDto.getContactNo(), passengerDto.getName(), passengerDto.getEmail(),
				passengerDto.getAge(), passengerDto.getSex(), passengerDto.getAddress(), passengerDto.getPassword(), passengerDto.isActive());	
				Passenger saved = passengerRepository.save(passenger);
				System.out.println("Passenger Registered");
				return saved;
	}

	@Override
	public Passenger getPassengerByContactNo(String contactNo) {
        if (passengerRepository.findById(contactNo).isPresent())
            return passengerRepository.findById(contactNo).get();
        else
            throw new MongoException("Record not Found");
	}

	@Override
	public Passenger updatePassenger(PassengerModel passengerDto, String contactNo) {
		if(passengerRepository.findById(contactNo).isPresent()) {
			Passenger existingPassenger = passengerRepository.findById(contactNo).get();
			if(existingPassenger.isActive()) {
				existingPassenger.setContactNo(passengerDto.getContactNo());
				existingPassenger.setName(passengerDto.getName());
				existingPassenger.setEmail(passengerDto.getEmail());
				existingPassenger.setAge(passengerDto.getAge());
				existingPassenger.setSex(passengerDto.getSex());
				existingPassenger.setAddress(passengerDto.getAddress());
				existingPassenger.setPassword(passengerDto.getPassword());
			}else {
				System.out.println("Passenger is not active");
			}

			return passengerRepository.save(existingPassenger);
		}
		 else
	            throw new MongoException("Record not found");
	}

	@Override
	public Passenger deletePassengerByContactNo(String contactNo) {
		  if (passengerRepository.findById(contactNo).isPresent()) {
	            Passenger deleted = passengerRepository.findById(contactNo).get();
	            if(deleted.isActive()) {
	            passengerRepository.delete(deleted);
	            }else {
	            	System.out.println("Passenger is not active");
	            }
	            return deleted;
		  }else
	            throw new MongoException("Record not Found");
	}

}
