package com.grey.smartCampus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grey.smartCampus.Model.Attendance;
import com.grey.smartCampus.Repository.AttendanceRepository;

@Service
public class AttendanceService 
{
	@Autowired
	AttendanceRepository ar;

	public Attendance getById(int id) 
	{
		return ar.getById(id);
	}

	public String addAttendance(Attendance a) {
		
		ar.save(a);
		return "Added Successfully";
	}


	
	
   
    
}