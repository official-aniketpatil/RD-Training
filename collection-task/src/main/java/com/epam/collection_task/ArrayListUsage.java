package com.epam.collection_task;

import java.util.ArrayList;

import com.epam.model.Address;
import com.epam.model.Customer;

class ArrayListUsageHelper {
	public static void runApplication() {
	    ArrayListUsage arrayListUsage = new ArrayListUsage();
        Address address = new Address("Pune","Maharashtra",416110);
		Customer customer = new Customer(1,"aniket",address);
		arrayListUsage.addCustomer(customer);
		customer = new Customer(2,"rahul",address);
		arrayListUsage.addCustomer(customer);
		arrayListUsage.removeCustomer(customer);
		arrayListUsage.printCustomerInformation();
	}
}
public class ArrayListUsage {
	ArrayList<Customer> customers;
	
	public ArrayListUsage(){
		customers = new ArrayList<Customer>();
	}
	public void printCustomerInformation() {
		for(Customer customer : customers) {
			System.out.println(customer);
		}
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}
	public static void main(String[] args) {
	   ArrayListUsageHelper.runApplication();
	}

}
