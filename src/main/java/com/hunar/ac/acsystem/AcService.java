package com.hunar.ac.acsystem;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hunar.ac.acsystem.model.Aircraft;
import com.hunar.ac.acsystem.model.AircraftSize;
import com.hunar.ac.acsystem.model.AircraftType;

@Service
public class AcService {
	
	//@Autowired
    //private MuscleCarDao muscleCarDao;
	
	private LinkedList<Aircraft> list = AcsystemApplication.list;

	public AcService() {
		
	}
	
	public void addAircraft(Aircraft aircraft) {
		
	    int prior = aircraft.getPriority();
		int i = 0;

		for (Aircraft ac: list) {
			if ( prior > ac.getPriority()  ) {
				list.add(i, aircraft);
				return;
			}
			i++;
		}
		
		list.add(aircraft);
	}

	public List<Aircraft> listAircraft() {
		return this.list;
	}
	
	public void deleteAircraft() {
		if (!list.isEmpty())
			list.removeFirst();
	}
}
