package com.epam.collection_task;

import java.util.HashSet;

class HashSetUsageHelper {
	public static void runApplication() {
		HashSetUsage hashSetUsage = new HashSetUsage();
		hashSetUsage.add(1);
		hashSetUsage.add(1);
		hashSetUsage.add(2);
		hashSetUsage.add(2);
		hashSetUsage.printUniqueElements();
	}
}
public class HashSetUsage {
    private HashSet<Integer> hashSet;
    
    public HashSetUsage(){
    	hashSet = new HashSet<Integer>();
    }
    public void printUniqueElements() {
    	System.out.println(hashSet);
    }
    public void add(int element) {
    	hashSet.add(element);
    }
	public static void main(String[] args) {
		HashSetUsageHelper.runApplication();
	}

}
