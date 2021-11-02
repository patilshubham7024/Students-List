package com.te.arraylistimpl;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student("Shubham",45,24));
		list.add(new Student("vikas",45,24));
		list.add(new Student("Akash",45,24));
		list.add(new Student("Kunal",45,24));
		
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
		}
	
	}
	
}
