package com.org.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.Doctor;
import com.org.repo.DoctorRepo;
@Service("doctorService")
public class DoctorImpl implements IDoctorService{
	@Autowired
	private DoctorRepo docRepo;
	@Override
	public Doctor getCustomerById(int id) throws Exception {
		Optional<Doctor> doctor = docRepo.findById(id);
		if(doctor.isPresent())
			return doctor.get();
		else
			throw new IllegalArgumentException("doc not found with "+id);
		
	}

}
