package com.epam.collection_task;

import java.util.Arrays;

import com.epam.exceptions.DuplicateValueException;
import com.epam.exceptions.ElementNotFoundException;

class SetHelper {
	private Set<Integer> set;
	private Input input;
	
	public SetHelper() {
		set = new Set<Integer>();
		input = new Input();
	}
	
    private void addElement(Integer value) throws DuplicateValueException {
		set.add(value);
	}
    
    private void removeElement(Integer value) throws ElementNotFoundException {
    	set.remove(value);
    }
    private void printElement() {
    	set.printElements();
    }
    private void printSize() {
    	System.out.println(set.Size());
    }
    private void printMenu() {
    	System.out.println("Enter \n 1) add Element \n 2) remove Element");
		System.out.println(" 3) show Element \n 4) show size\n 5) Exit");
    }
	public void runApplication() throws ElementNotFoundException {
	    while(true) {
	    	printMenu();
	    	int choice = input.getInteger();
	    	int value = 0;
	    	if(choice == 5) {
	    		break;
	    	}
	    	switch(choice) {
	    	case 1:
	    		System.out.println("Enter Element");
		    	value = input.getInteger();
	    		try {
		    	addElement(value);
		    	}catch (DuplicateValueException duplicateValueException) {
		    		System.out.println(duplicateValueException.getMessage());
		    	}
		    	break;
	    	case 2:
	    		System.out.println("Enter Element");
		    	value = input.getInteger();
	    		try {
		    	removeElement(value);
	    		}catch(ElementNotFoundException elementNotFoundException) {
	    			System.out.println(elementNotFoundException.getMessage());
	    		}
	    		break;
	    	case 3:
	    		printElement();
	    		break;
	    	case 4:
	    		printSize();
	    		break;
	    	default:
	    		System.out.println("Enter a valid choice");
	    	}
	    	
	    }
	}
}
public class Set<T> {
  private T[] elements;
  private int size;
 
  public Set(T[] elements) {
	  this.elements = elements;
	  this.size = elements.length;
  }
  public Set() {
	   this.elements = (T[]) new Object[1];  
	   this.size = 0;
  }
  public T [] getElements() {
	  return Arrays.copyOfRange(elements, 0, size);
  }
  public int Size() {
	  return size;
  }
  public void ensureCapacity() {
	  if(size == elements.length) {
		 elements = Arrays.copyOf(elements, size+16);
	  }
  }
  public void add(T value) throws DuplicateValueException {
	  for(int i = 0; i< size; i++) {
		  if(elements[i].equals(value)) {
			throw new DuplicateValueException("Duplicate values are not allowed in set");  
		  }
	  }
	  ensureCapacity();
	  elements[size] = value;
	  size++;
  }
  private void LeftShift(int index) {
	  for(int i = index; i < size-1; i++) {
		  elements[i] = elements[i+1];
	  }
  }
  public void remove(T value) throws ElementNotFoundException {
	  int index = -1;
	  for(int i = 0; i < size; i++) {
		  if(elements[i].equals(value)) {
			  index = i;
		  }
	  }
	  if(index == -1) {
		  throw new ElementNotFoundException("Value not in Set");
	  }
	  LeftShift(index);
	  size--;
	  
  }
  public void printElements() {
	  for(int i = 0; i < size; i++) {
		  System.out.print(elements[i]+" ");
	  }
	  System.out.println("");
  }
  public static void main(String[] args) throws DuplicateValueException, ElementNotFoundException {
	  SetHelper setHelper = new SetHelper();
	  setHelper.runApplication();
  }
}
