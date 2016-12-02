import java.util.Scanner;

/**
 * 
 */

/*
 * ArrayFrequency.java
 * Jasmyn Stansfield
 * Assignment 5, Program 2
 * Mr. Hardman
 * November 28, 2016
 */
public class ArrayFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] userArray = new int[10];
		int userValue;
		int counter = 0;
		
		
		System.out.println("Please enter ten numbers.");
		
		for(int i = 0; i < userArray.length; i++){
		userArray[i] = userInput.nextInt();
		
		}

		System.out.println();
		System.out.println("What value do you want to search for?");
		userValue = userInput.nextInt();
		
		for(int i = 0; i < userArray.length; i++){
			
			if(userArray[i] == userValue){
				
				counter = counter + 1;
			}
			
		}
		
		if(counter == 0){
			
			System.out.println("This is not in the array");
			
		} else {
			
			System.out.println(userValue + " is in the array " + counter + " time(s).");
		}
		
		userInput.close();
	}

}
