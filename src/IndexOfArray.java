import java.util.Scanner;

/**
 * 
 */

/*
 * IndexOfArray.java
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 5, Program 1
 * November 28, 2016
 */
public class IndexOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {14, 22, 1, 66, 18, 76, 41, 99, 52};
		int index = -1;
		int userValue;
		
		
		for(int i = 0; i < myArray.length; i++){
			
			System.out.print(myArray[i] + "   ");
			
		}
		
		System.out.println();
		System.out.println("What value do you want the index of?");
		userValue = userInput.nextInt();

		for(int i = 0; i < myArray.length; i++){
			
			if(myArray[i] == userValue){
				
				index = i;
			}
			
		}
		
		if(index == -1){
			
			System.out.println("This is not in the array");
			
		} else {
			
			System.out.println("The index of " + userValue + " is " + index);
		}
		
		
		userInput.close();
	}

}
