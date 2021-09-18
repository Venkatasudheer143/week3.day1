package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
	
		System.out.println("Student-studentName");
	}
	public void studentDept() {
		System.out.println("Student-studentDept");

	}
	public void studentId() {
		
		System.out.println("Student-studentId");
	}
	
	
	public static void main(String[] args) {
		 
		Student stObj = new Student();
		//student class methods
		stObj.studentId();
		stObj.studentName();
		stObj.studentDept();
		
		//depart methods
		stObj.deptName();
		
		//college methods
		stObj.collegeName();
		
	}
}
