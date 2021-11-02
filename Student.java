package com.te.arraylistimpl;

public class Student implements Comparable<Student>{
	String name;
	int id;
	int age;
	public Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		
		return this.id - o.id;
	}
	public String toString() {
		return "ID: "+this.id+"\nName: "+this.name;
	}
	
}