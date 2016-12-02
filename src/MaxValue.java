import java.util.Scanner;

/**
 * 
 */

/*
 * MaxValue.java
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 5, Program 3
 * November 28, 2016
 */
public class MaxValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] userArray = new int[5];
		int max;
		
		
		System.out.println("Please enter 5 integers.");
		
		for(int i = 0; i < userArray.length; i++){
		userArray[i] = userInput.nextInt();
		
		
		}
		
		for(int i = 0; i < userArray.length; i++){
			
			System.out.print(userArray[i] + "   ");
			
		}
		
		max = userArray[0];
		
		
		for(int i = 0; i < userArray.length; i++){
		
			if (userArray [i] > max){
			
				max = userArray [i];
			}
		}
		
		System.out.println();
		System.out.println("The maximum value is " + max);
		
		userInput.close();	
		
	}

}
