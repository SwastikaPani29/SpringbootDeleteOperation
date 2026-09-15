package com.org.repo;



import org.springframework.data.jpa.repository.JpaRepository;


import com.org.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{
 
}
