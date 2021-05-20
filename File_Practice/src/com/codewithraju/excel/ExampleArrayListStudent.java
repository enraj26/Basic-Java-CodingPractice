package com.codewithraju.excel;

import java.util.ArrayList;

public class ExampleArrayListStudent {

	public static void main(String[] args) {

		Student std = new Student();
		std.id = 1;
		std.name = "Text1";
		std.qual = "B.Tech";
		std.marks = 22;

		Student std1 = new Student();
		std1.id = 2;
		std1.name = "Text2";
		std1.qual = "M.Tech";
		std1.marks = 24;

		Student std2 = new Student();
		std2.id = 3;
		std2.name = "Text3";
		std2.qual = "Degree";
		std2.marks = 19;

		ArrayList<Student> stdsList = new ArrayList<>();
		stdsList.add(std);
		stdsList.add(std1);
		stdsList.add(std2);
		
		for (int i = 0; i < stdsList.size(); i++) {
			Student stu = stdsList.get(i);
			System.out.println("----"+stu.name+","+stu.id);
		}
	}

}
