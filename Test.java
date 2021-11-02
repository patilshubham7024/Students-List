package com.te.comparatorimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	static Scanner s = new Scanner(System.in);

	static int displayOptions() {
		System.out.println("Sort by:\n1.ID\n2.Name\n3.Age\n4.Marks\n Press 5 to exit");
		return s.nextInt();
	}

	static void ask() {
		System.out.println("Do you want to sort again?\nY/N");
	}

	static void stop() {
		System.out.println("Thanks");
		System.exit(0);
	}

	static void print(Object list) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(new Student(1, "Shubham", 23, 94));
		list.add(new Student(2, "vikas", 24, 90));
		list.add(new Student(3, "Akash", 26, 96));
		list.add(new Student(4, "Kunal", 22, 24));

		int option = 1;
		while (option >= 1 && option <= 4) {

			option = displayOptions();

			switch (option) {
			case 1:
				Collections.sort(list, new SortById());
				print(list);
				break;
			case 2:
				Collections.sort(list, new SortByName());
				print(list);
				break;
			case 3:
				Collections.sort(list, new SortByAge());
				print(list);
				break;
			case 4:
				Collections.sort(list, new SortByMarks());
				print(list);
				break;
			case 5:
				stop();
			default:
				System.out.println("Invalid option");
				option = 1;
				continue;
			}

			ask();
			String ask = s.next();
			if (ask.equals("n") || ask.equals("N"))
				option = 5;
			else if (!ask.equals("y") || !ask.equals("Y"))
				System.out.println("Choose either y or n");
		}
		stop();

	}

	static {
		System.out.println("Hello\n");
	}
}