package com;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] student=new Student[5];
		
		student[1]=new Student(20, "Ram", 70);
		student[2]=new Student(21, "Ram", 70);
		student[3]=new Student(22, "Ram", 70);
		student[4]=new Student(23, "Ram", 70);
		student[5]=new Student(24, "Ram", 70);
		
		Student[] returned_array=splitStudentArray(student, 'o');
		
		for(Student element:returned_array) {
			System.out.println(element.getName()+"  "+element.getMarks());
		}
	}
	public static Student[] splitStudentArray(Student[] students,char type) {
		Student[] array=null;
		
		if(type=='o') {
			
		}
		if(type=='e') {
			
		}
		else {
	
		}
		return array;
	}
}
