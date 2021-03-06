package com.demo.java8.data; 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int notebooks;
    private Optional<Bike> bikes = Optional.empty();
    

    public Optional<Bike> getBikes() {
		return bikes;
	}


	public void setBikes(Optional<Bike> bikes) {
		this.bikes = bikes;
	}


	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int notebooks) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
		this.notebooks = notebooks;
	}


	public int getNotebooks() {
		return notebooks;
	}


	public void setNotebooks(int notebooks) {
		this.notebooks = notebooks;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	public Student(String name) {
		super();
		this.name = name;
	}


	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
    
    public void printListOfActivities() {
    	System.out.println(activities);
    }

    @Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + ", notebooks=" + notebooks + ", bikes=" + bikes + "]";
	}


}
