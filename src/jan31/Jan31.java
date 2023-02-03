package jan31;

import java.util.Scanner;

public class Jan31 
{

	public static void main (String[] args) 
	{
		final int NOELEM =10;
		int[] list = new int [NOELEM]; // array will contain 10 indexes
		
		Scanner input = new Scanner (System.in);
		getIntegers(input, list);
		System.out.print("\n");
		printList(list);
		
		// print sum of the list elements
		System.out.print("\nSum of the list of elements is: " +sumList(list) + "\n\n");
		
		//print all negative indexes
		System.out.print("The negative indexes are: \n");
		negativeIndexes(list);
		System.out.print("\n");
		
		// print all indexes that are even
		System.out.print("The even indexes are: \n");
		evenIndexes(list);
		System.out.print("\n");
		
		// find the smallest element in the list
		System.out.print("The smallest element is: \n");
		int smallest = smallestElement(list);
		System.out.print(smallest);
		System.out.print("\n");
		
		// find the largest element in the list
		System.out.print("The largest element is: \n");
		int largest = largestElement(list);
		System.out.print(largest);
		System.out.print("\n");
		
		// find sum of positive integers in the list
		System.out.print("The sum of the postive integers is: \n");
		int sumPositives = positiveSum(list);
		System.out.print(sumPositives);
		System.out.print("\n");
		
		// search for an element in the list
		int key =0;
		System.out.print("Enter a number you want to search for: ");
		key = input.nextInt();
		System.out.print("Numbers in array that correspond to your search: \n");
		displayKey(list, key);
		
	}
	
	private static void displayKey(int[] list, int key) // search for the key entered by user and display if found
	{
		for (int x =0; x< list.length; x++)
		{
			if (list[x] == key)
				System.out.print(key + "\n");
		}
	}

	private static int positiveSum(int[] list) // print the sum of all positive integers in the array
	{
		int sum=0;
		
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] >=0)
			sum += list[i];
		}
		
		return sum;
	}

	private static int largestElement(int[] list) // find and print the largest index in the array
	{
		int largest = -1000000000; 
		for (int z =0; z < list.length; z++) 
		{
			if (list[z] > largest)
				largest = list[z];
		}
		return largest;
	}

	private static int smallestElement(int[] list) // find and print the smallest index in the array
	{
		int smallest = 1000000000;
		for (int z =0; z < list.length; z++) 
		{
			if (list[z] < smallest)
				smallest = list[z];
		}
		return smallest;
	}

	private static void evenIndexes(int[] list) // find and print the even-numbered indexes
	{
		for (int x = 0; x< list.length; x++)
		{
			if (list[x] % 2 ==0)
				System.out.println(list[x]);
		}
		
		
	}

	private static void negativeIndexes(int[] list) // find and print the negative indexes
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] < 0)
			{
				System.out.print(list[i]  + "\n");
			}

		}
	}

	private static int sumList(int[] list) // find the sum of all the indexes
	{
		int sum=0;
		
		for (int i = 0; i < list.length; i++)
		{
			sum += list[i];
		}
		
		return sum;
	}

	private static void printList(int[] list) // print all the elements of the array
	{
		for (int i = 0; i < list.length;  i++) 
		{
			System.out.print(list[i] + "\n");
		}
		
	}

	public static void getIntegers(Scanner input, int[] list) // take the integers in to the array from the user
	{
		for (int i = 0; i < list.length;  i++)
		{
			System.out.print("Enter an integer (" + i +") ");
			list[i] = input.nextInt();
		}
		
	}
	
}
