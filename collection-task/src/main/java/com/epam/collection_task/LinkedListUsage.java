package com.epam.collection_task;

import java.util.LinkedList;

import com.epam.model.Address;
import com.epam.model.Customer;

class CustomerQueue {
	LinkedList<Customer> customerQueue;
	
	CustomerQueue(LinkedList<Customer> customerQueue){
	 this.customerQueue = customerQueue; 	
	}
	
	public void printCustomerQueue() {
	  for(Customer customer : customerQueue ) {
		  System.out.println(customer);
	  }	
	}
}
class LinkedListUsageHelper {
	public static void runApplication() {
		 LinkedList<Customer> queue = new LinkedList<Customer>();
		 Address address = new Address("Pune","Maharashtra",416110);
		 Customer customer = new Customer(1,"aniket",address);
		 queue.add(customer);
		 customer = new Customer(2,"rahul",address);
		 queue.add(customer);
		 customer = new Customer(3,"rohan",address);
		 queue.add(customer);
		 CustomerQueue customerQueue = new CustomerQueue(queue);
		 customerQueue.printCustomerQueue();
	}
}
public class LinkedListUsage {

	public static void main(String[] args) {
		LinkedListUsageHelper.runApplication();

	}

}
