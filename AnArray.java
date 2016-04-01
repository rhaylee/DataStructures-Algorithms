/* CS3810 Data Structures and Algorithms
   Assignment One
   Mandi Fuccillo
   Function Description: This program creates an array
   of integers (number) between 0 and 50, via user input
   using scanner. It tracks the occurences or frequency
   of each number entered and lists it at the end
*/
import java.util.*;

public class AnArray
{
	public static void main (String [] args)
	{
		// creates an array of interegers between 0 and 50
		int element[] = new int [51];

		// scanner for input
		Scanner scan = new Scanner(System.in);

		int input;

		// do/while loop for inputs

		do
		{
			System.out.println("Enter a number between 0 and 50. Enter -1 to quit.");
			input = scan.nextInt();

			if(input == -1)
			{
				System.out.println("Invalid input");
			}
			else if(input > 50)
			{
				System.out.println("Invalid input");
			}
			else if (input < -1)
			{
				System.out.println("Invalid input");
			}
			else if(input == -1)
			{
			// quits loop
			}
			// accumulator of frequencies of the numbers
			else
			{
				element[input]++;
			}
		}
		// sentinel loop -1 to quit the loop
		while(input != -1);
		// header for table
		System.out.println("Number Entered" + "  " + "Frequency");
		System.out.println("--------------" + "  " + "---------");
		// numbers entered
		for(int i = 0; i < element.length; i++)
		{
			// so numbers entered do not show up
			if(element[i] > 0)
			{
				System.out.println(i + "               " + element[i]);
			}
		}
	}
}