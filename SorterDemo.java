package com;

public class SorterDemo {

	public static void main(String[] args) {
		double[] arr_double=new double[3];
		String str;
		Student[] arr_student=new Student[3];
		
		arr_student[0]=new Student(20, "Ram", 70);
		arr_student[1]=new Student(20, "Ram", 70);
		arr_student[2]=new Student(20, "Ram", 70);
		
		arr_double[0]=arr_student[0].getMarks();
		arr_double[1]=arr_student[1].getMarks();
		arr_double[2]=arr_student[2].getMarks();
		
		str=new String(arr_student[0].getName()+arr_student[1].getName()+arr_student[2].getName());
		
		System.out.println(sortDouble(arr_double));
		System.out.println(sortString(str));
		System.out.println(sortStudent(arr_student));
	}
	public static double[] sortDouble(double[] arr_double) {
		java.util.Arrays.sort(arr_double);
		return arr_double;
	}
	public static String sortString(String str) {
		char[] arr=str.toCharArray();
		java.util.Arrays.sort(arr);
		return arr.toString();
		
	}
	public static Student[] sortStudent(Student[] arr_student) {
		java.util.Arrays.sort(arr_student);
		return arr_student;
	}
}
