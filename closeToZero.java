import java.util.Arrays;
import java.lang.Math;

/**
 * This program takes in an array of number and returns the number closer
 * to 0, logic here is take the array of doubles sort it and return the 
 * number at index 0.
 *
 * @author Utsav Roy 3/2/2017
 */
 
public class closeToZero{

	/**@brief!
 	* This method takes an array of double sorts it and 
 	* returns the index 0 of the array
 	*
 	* @param array of double
 	*/  
	private static double closestToZero(double[] array){

		double temp =0;
		double temp2 = array[0];
		
		for(int i =0; i < array.length; i++){

			temp = Math.pow(array[i], 2);

			//test purpose
			//System.out.print(temp);
			//System.out.println("<="+temp2*temp2);

			if(temp <= Math.pow(temp2, 2)){
				temp2 = array[i];	
			}
		}
		return temp2;
	}

	//main
	public static void main(String [] args){

		double[] arr = new double[] {199, -0.9,9,8, 45,2, 1.5,0.99,-87};
		System.out.println(closestToZero(arr));
	}
}
