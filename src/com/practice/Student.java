package com.practice;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * we override equals method from object class in public boolean equals(object
	 * o) method if id of two Student class object are equal then the two Student
	 * object are equal otherwise both object are different to each other.
	 */

	@Override
	public boolean equals(Object o) {
//		if(this == o) return true;
//		if(o == null || getClass() != o.getClass() ) return false;
		Student student = (Student) o;
		return id == student.id;
	}

	/*
	 * if we don't override the hashcode method with object class of hashcode()
	 * method, or if we use the same hashcode() method which is implemented on
	 * object class then In that case it will create two hashcode and the equal
	 * object of student class(which is coming from override equals() method) store
	 * in different bucket in hashmap
	 */

//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}

	/*
	 * if we override the hashcode() method as per our requirement then it give the
	 * proper output, it will create one object and it will replace the previous
	 * inserted object value
	 */

	@Override
	public int hashCode() {
		return id;
	}

}
