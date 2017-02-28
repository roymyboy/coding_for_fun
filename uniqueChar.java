import java.util.Scanner;

/**
 * This program returns the unique character if there is any
 * when user inputs a sequence of string if not unique character 
 * found, the program returns a message saying no unique character
 * found in the given string.
 *
 * @author Utsav Roy
 */ 

public class uniqueChar{
	public static void main(String [] args){

		//helper variables 
		String input, uniqueChar = " ";
		
		//initializing new scanner to read user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input here for the unique char: ");
		input = scan.next();

		for(int i = 0; i < input.length(); i++){
			char char1 = input.charAt(i);
			boolean found = false;
			for(int j = 0; j < input.length(); j++){
				if(j == i) continue;
				char char2 = input.charAt(j);
				if(char1 == char2){ //compare each the character with input
					found = true;
					break;
				}
			}

			//outputs
			if(!found){		
				System.out.print("The unique characters are: " + char1 + "\n");
			}	
		}
		scan.close(); //close scanner
	}
}
