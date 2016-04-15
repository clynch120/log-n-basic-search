package edu.week2;

public class Search 
{

	public static void main(String[] args) 
	{
		int a [] = new int[1000000];
		for (int i = 0; i<a.length; i++)
		{
			a[i] = i;
		}
		findNumber(a, 1000000);
	}

	public static void findNumber(int[]a, int key)
	{
		int low = 0;
		int high = a.length;
		int howMany = 0;
		if(key >= a.length)
		{
			System.out.println("Number to large");
		}
		else
		{
			while(low <= high)
			{
				howMany ++;
				int mid = low + (high - low) / 2;
				if (key < a[mid]) high = mid -1;
				else if (key > a[mid]) low = mid +1;
				else
				{
					System.out.println("Found " + key + " at " + mid);
					System.out.println("It took " + howMany + " guesses");
					break;
				}
			}
		}
	}
}
