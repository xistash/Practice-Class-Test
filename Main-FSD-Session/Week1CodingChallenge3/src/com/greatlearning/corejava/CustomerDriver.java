package com.greatlearning.corejava;

public class CustomerDriver {
	public static void main(String[]args) {
		
		Customer customer = new Customer();
		
		System.out.println("The First Name is " + customer.FirstName);
		System.out.println("The Last Name is " + customer.LastName);
		System.out.println("The Age of customer is " + customer.age + " year's");
		System.out.println("The Customers Location is " + customer.Location);
		//System.out.println("The Customers Password is " + customer.Password);
		//password is a private class so it will not be available in different class 
		
	}

}
