import java.util.Scanner;

/**
 * This progrm works like a reverse, it can reverse string or integer
 * depending on user input and choice
 * To reverse the STRING, user must input the value "0"
 * To reverse the Integer, user must input the value "1"
 * To find the reverse Factorial, user must input the value "2"
 *
 * @author Utsav Roy 2/27/2017
 */ 

public class rev{

	public static void main (String [] args){
		String revThisStr = " ";
	 	int revThisInt = 0, num;
		float rev = 0;
		Scanner check = new Scanner(System.in);
		System.out.print("To reverse STRING enter 0." + 
				 "To reverse INTEGER enter 1." +
				 "To find the reverse Factorial enter 2." +
					"\n" + "Here: ");
		num = check.nextInt();
 		if(num == 0){
			revString(revThisStr);
		} else if (num == 1){
			revInt(revThisInt);
		} else if (num == 2) {
			revFact(rev);
		}else {
			System.out.println("What the heck????? I said 0 or 1 or 2");
		}
	}
	
	/**@brief!
 	* This function takes in an integer from user and reverses it and 
 	* rerutns the reverse of the user input.
 	*
 	* @param integer type number
 	* @return reversed number 
 	*/  
	public static int revInt(int num){	

		int revNum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number you would like to reverse: ");
		num = scan.nextInt();
		while(num != 0){		
		    revNum =  revNum*10 + num % 10;
		    num = num/10;
		}
		System.out.println("Your reverse number is: " + revNum);
		return revNum;
	}
	
	/**@brief!
 	* This function takes in a sequence of string and reverses it and
 	* returns the reverse of the user input.
 	*
 	* @param String type str
	* @return reversed string
 	*/  
	private static String revString(String str){

		String revStr = " ";
		Scanner strScan = new Scanner(System.in);
		System.out.print("Please enter the string you would like to reverse: ");
		str = strScan.next();
		for(int i = str.length(); i>0; i--){
		//	System.out.println(i + ":" + str.charAt(i-1)); //test purpose only
			revStr += str.charAt(i-1);		
		}
		System.out.println("Your reversed string is: " + revStr);
		return revStr;
	}

	/**@brief!
 	* This function takes integer and returns the possible reverse factorial 
 	* of the user input.
 	*
 	* @param integer type fact
 	* @return reverse factorial
 	*/

	private static float revFact(float fact){
		
		int revFact = 0;
		Scanner checkFact = new Scanner(System.in);
		System.out.print("Please enter the number to find the reverse factorial of: ");
		fact = checkFact.nextFloat();
		
		if(fact == 0 || fact == 1){ //base case
			System.out.println("The reverse factorial of input is: " + 1);
			return 1;
		} else {
				revFact = 1;
			while(fact/revFact != 1){
				fact = fact/revFact;
				revFact++;
				if(fact/revFact == 1){
					System.out.println("Reverse factorial of the input is: " + revFact + "!");
					return revFact;
				} else if (fact % revFact != 0){
					
					System.out.println("Bad input please make sure there is a possible reverse factorial of the input.");
					return 0;
				} 
			}
		}
		return 0;
	}  
}
