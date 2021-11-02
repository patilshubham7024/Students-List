package com.te.arraylistimpl;

public class TestMyArray {

	private static Object foreach;

	public static void main(String[] args) {
		MyArrayList list= new MyArrayList(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		
//		MyArrayList itr = list.iterator();
		for (Object object : list) {
			System.out.println(object);
		}
	}
}