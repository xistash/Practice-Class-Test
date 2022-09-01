package com.greatlearning.codingChallenge;

public class Customer {
	String fullname;
	int age;

	public static void main(String[]args) {

		Customer customer = new Customer();
		customer.fullname = "Akshay";
		customer.age = 23;

		//printing

		System.out.println(customer.fullname);
		System.out.println(customer.age);

	}


}
