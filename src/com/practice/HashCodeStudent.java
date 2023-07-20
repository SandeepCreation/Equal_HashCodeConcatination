package com.practice;

import java.util.HashMap;

public class HashCodeStudent {

	public static void main(String[] args) {
//		HashMap<Student, String> hm = new HashMap<Student, String>();

//		Student s1 = new Student(1, "pankaj sir");
//		Student s2 = new Student(1, "dnyaneshwar");
//
//		hm.put(s1, "ram");
//		hm.put(s2, "gan");
//
//		System.out.println(hm);
//
//		System.out.println(s1.equals(s2));

//		HashMap<Parent, String> hm = new HashMap<Parent, String>();
//
//		Parent p1 = new Parent(1, "pankaj sir");
//		Parent p2 = new Parent(2, "dnyaneshwar");
//
//		System.out.println(p1.equals(p2));
//
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//
//		hm.put(p1, "ram");
//		hm.put(p2, "ganesh");
//
//		System.out.println(hm);

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		System.out.println(hm.put(1, "ram"));
		System.out.println(hm.put(1, "ganesh"));

		System.out.println(hm);

	}

}
