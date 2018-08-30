package com.hunar.ac.acsystem;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hunar.ac.acsystem.model.Aircraft;

@SpringBootApplication
public class AcsystemApplication {

	//public static List<Aircraft>list = new ArrayList<Aircraft>();
	//public static Deque<String> list = new LinkedList<>();
	public static LinkedList<Aircraft> list = new LinkedList<Aircraft>();
	
	public static void main(String[] args) {
	
		
		SpringApplication.run(AcsystemApplication.class, args);
	}
}
