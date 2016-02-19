package edu.saintjoe.cs.rpostma;

public class tempDriver {

	public static void main(String[] args) {
		int array[];
		int size = 10;//array size
		
		array = new int[size];
		
		for (int i = 0; i < size; ++i){
			array[i] = i*i;
			System.out.println("Array has " + array[i] + " in position " + i);
		}
		System.out.println("Notice a pattern?");
	
	}
	
}
