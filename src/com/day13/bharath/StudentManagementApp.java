package com.day13.bharath;

import java.util.HashMap;
import java.util.Map;

/*
 * Mini Task – Student Management App
Create a simple app using Map<Integer, String>:

Keys = student roll numbers

Values = student names

Features:

Add student

Display all students

Search by roll number
 */
public class StudentManagementApp {
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "A_name");
		m.put(2, "B_name");
		m.put(3, "C_name");
		m.put(4, "D_name");
		m.put(5, "E_name");
		
		for(Map.Entry<Integer, String> nm : m.entrySet()){
			System.out.println(nm);
		}
		
		System.out.println("-------------");
		
		System.out.println("At key 3 : "+m.get(3));
		
		System.out.println("-------------");
		
		for(Map.Entry<Integer, String> nm : m.entrySet()){
			System.out.println("Roll : "+nm.getKey()+" -> Name : "+nm.getValue());
		}
	}

}
