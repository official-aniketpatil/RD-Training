package com.epam.collection_task;

import java.util.TreeMap;

class TreeMapUsageHelper {
	public static void runApplication() {
		TreeMapUsage treeMapUsage = new TreeMapUsage();
		treeMapUsage.add(2, "virat");
		treeMapUsage.add(1, "sachin");
		treeMapUsage.add(3, "rohit");
		treeMapUsage.printRankStatistics();
	}
}
public class TreeMapUsage {
	private TreeMap<Integer,String> rankWithName;
	
	public TreeMapUsage(){
		rankWithName = new TreeMap<Integer, String>();
	}
	
	public void add(int rank, String name) {
		rankWithName.put(rank, name);
	}
	public void printRankStatistics() {
		System.out.println(rankWithName);
	}
	public static void main(String[] args) {
		TreeMapUsageHelper.runApplication();
	}

}
