package com.epam.collection_task;

class PyramidHelper {
	public static void runApplication() {
		Input input = new Input();
		System.out.println("Enter height of pyramid");
	    int height = input.getInteger();
		System.out.println("Enter multiplying factor");
		int multiplyingFactor = input.getInteger();
		Pyramid pyramid = new Pyramid(height, multiplyingFactor);
		pyramid.printPyramid();
	}
}
public class Pyramid {
    private int height;
    private int multiplyingFactor;
	
    public Pyramid(int height, int multiplyingFactor){
    	this.height = height;
    	this.multiplyingFactor = multiplyingFactor;
    }
    public void printPyramid() {
    	int count = 0;
		for(int i = 0; i < height; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(count*multiplyingFactor+"  ");
				count++;
			}
			System.out.println();
		}
    }
	public static void main(String[] args) {
	  PyramidHelper.runApplication();
	}

}
