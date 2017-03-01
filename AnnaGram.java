import java.util.Arrays;
import java.util.Scanner;

/**
 * This program is to find if the two pair of string given by user is Anagam or not,
 * The logic here is, user inputs two string, it is converted to lowercase sorted as
 * char in an char array and appended back the sorted char as String, compare both 
 * with .equals() and check if they are equal or not, if they are equal return yes 
 * they are anagram and if not return they are not anagram.
 *
 * @author Utsav Roy 3/1/2017
 */ 
public class AnnaGram{

	public static String isAnnagram(String a, String b){
		
		char[] str1 = a.toCharArray(); 
		char[] str2 = b.toCharArray();

		//sort the character in an array 
	        Arrays.sort(str1);
	        Arrays.sort(str2);

		//retrive it as string 
	        String sorted1 = new String(str1);
	        String sorted2 = new String(str2);
	
		//testing purpose
		//System.out.println(sorted1);	
		//System.out.println(sorted2);	
	
		//check if the string are equal
		if( sorted1.equals(sorted2) ){
			System.out.println("'"+ a +"'" + " and " + "'" + b + "'" + " are Anagram.");
		} else {
			System.out.println("'"+ a +"'" + " and " + "'" + b + "'" + " are not Anagram.");
		}

	return null; //if reached here something is wrong
	}

	//main
	public static void main(String [] args){

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		String a1, b1;

		System.out.print("Please enter the first string: ");
		a1 = scan1.nextLine();

		System.out.print("Please enter the second string: ");
		b1 = scan2.nextLine();

		//calling the function and making it lowercase so the coomparison is accurate
		isAnnagram(a1.toLowerCase(), b1.toLowerCase());

		//close scanner
		scan1.close();
		scan2.close();
	}
}
