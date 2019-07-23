package com.epam.model;

public class Customer {

	private int id;
	private String name;
	private Address address;
	
	
	public Customer(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name+" "+address;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			if(((Customer) obj).getId() == id) {
				return true;
			}
		}
		return false;
	}
}
