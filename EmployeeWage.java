package com.bridgelabz.employeewage;

public class EmployeeWage {
	
	int wagePerHour = 20;
	int dailyHour = 8;
	int partTimeHours = 4;
	int partTimeWage;
	int dailyWage;
	

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
	
	

	public static void main(String[] args) {

		System.out.println("Welcome to employee wage Calculation Computation Program");
		
		EmployeeWage object = new EmployeeWage();
		
		object.employeeAttendence();
		
		object.dailyWage();
		
		object.employeePartTimeWage();
		
	
		
		

	}

}
