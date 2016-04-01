/*
CS3810 Data Structures and Algorithms
Mandi Fuccillo
Spring 2016
02/04/2016
Assignment 01 (Java array review):
Assign Date: 2/4/16
Due Date: 2/14/16
Programming:
Write a Java program that reads an arbitrary number of positive integers from the user. The number of the input data cannot be determined until the user quits. Store the integers in an array sequentially. To define the length of the array, we safely assume that the number of input data is not more than 100. When the user quits, your program takes out all even integers from the original array and put them in another array. Leave all odd integers in the original array with no holes (no third array should be used and no negative data used as the even number replacement in the original array).
You should display the following:
The contents in the original array as the order of input.
The contents in the even integer array with a count, as the order of input
The contents in the original integer array after taking out all even integers with a count, as the order of input
Display the appropriate message for any empty array (in case there is no input, no odd numbers or no even numbers).
Requirements:
The program should include a loop which allows arbitrary input and ends whenever the user wants to. In the loop body, prompt the user for the input and validate the input value (assume we allow int type positive integers only, zero is included).
Must use one array for the original input and another array for storing the even integers. The even and odd data should not be distributed in two arrays at the time of input. No third array (including the method parameters) is allowed in any of the operation.
Use the comment lines to write a document at the head of the program. The contents of the head document are:
The course number and title
The assignment number and the date
Your name
Function description (your algorithm to solve the problem)
The submitted program should be executable.
*/

import java.util.*;

public class EvenOdd
{
	public static void main(String[] args)
	{
	int n;
	Scanner s = new Scanner(System.in);

	System.out.println("Please enter number of integers:");
	n = s.nextInt();

	int a[] = new int[n];
	System.out.println("Enter all the numbers:");
	for (int i = 0; i < n; i++)
	{
		a[i] = s.nextInt();
	}

	ArrayList<Integer> list1 = new ArrayList();
	ArrayList<Integer> list2 = new ArrayList();

	for (int i = 0; i < a.length; i++)
	{
		System.out.print("The " + (i + 1) + " integer = ");
		a[i] = s.nextInt();
		if (a[i] % 2 == 0)
		{
				list1.add(a[i]);
			}
				else
			{
				list2.add(a[i]);
			}
		}
		list1.addAll(list2);
		for(int b : list1)
		{
			System.out.print(b + " ");
		}
	}
}
