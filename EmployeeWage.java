package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	int wagePerHour = 20;
	int dailyHour = 8;
	int partTimeHours = 4;
	int daysPerMonth = 20;
	int partTimeWage;
	int employeeHour;
	int dailyWage;
	int monthlyWage;

	public void employeeAttendence() {

		int empCheck = (int) (Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
		}

		else {
			System.out.println("Employee is Absent");
		}

		System.out.println();
	}
	
	
	public void dailyWage() {

		dailyWage = wagePerHour * dailyHour;
		System.out.println("Employee Daily wage = " + dailyWage);
	}
	
	public void employeePartTimeWage() {

		partTimeWage = wagePerHour * partTimeHours;
		System.out.println("Employee Part Time Wage :" + partTimeWage);
	}
	
	public void bySwitchCase() {
		Random ran = new Random();
		int empCheck = ran.nextInt(3);

		switch (empCheck) {
		case 0:
			employeeHour = 8;
			System.out.print("Present");
			break;
		case 1:
			employeeHour = 4;
			System.out.print("Part Time");
			break;
		case 2:
			employeeHour = 0;
			System.out.println("Absent");
			break;
		}
		System.out.println();
	}
	
	public void monthlyWage() {

		monthlyWage = dailyWage * daysPerMonth;
		System.out.println("Monthly Wage Of Employee is =" + monthlyWage);
	}


	

	public static void main(String[] args) {

		System.out.println("Welcome to employee wage Calculation Computation Program");
		
		EmployeeWage object = new EmployeeWage();
		
		object.employeeAttendence();
		
		object.dailyWage();
		
		object.employeePartTimeWage();
		
		object.bySwitchCase();
		
		object.monthlyWage();
		
	
		
		

	}

}
