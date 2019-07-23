package com.epam.collection_task;

import java.util.TreeSet;

class TreeSetUsageHelper {
	public static void runApplication() {
		TreeSetUsage treeSetUsage = new TreeSetUsage();
		treeSetUsage.add(5);
		treeSetUsage.add(1);
		treeSetUsage.add(1);
		treeSetUsage.add(2);
		treeSetUsage.printNonDuplicateWithOrder();
	}
	
}
public class TreeSetUsage {
    private TreeSet<Integer> treeSet;
    
    public TreeSetUsage(){
    	treeSet = new TreeSet<Integer>();
    }
    public void add(int element) {
    	treeSet.add(element);
    }
    public void printNonDuplicateWithOrder() {
    	System.out.println(treeSet);
    }
	public static void main(String[] args) {
		TreeSetUsageHelper.runApplication();
	}

}
