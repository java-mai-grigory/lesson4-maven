package lesson3.Algorithm;

import java.util.Arrays;

public class Program {


	static public void main(String[] args)
	{
		int A[] = {34, 48, 5, 4, 5, 89, 29, 35, 65, 75, 11, 34, 15, 27}; 
		Arrays.sort(A);

		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		
		int index = BinarySearch(A, 29);
		
		System.out.println("\n" + index);

	}

	public static int BinarySearch(int[] A, int key)
	{
		int left = 0;
		int right = A.length - 1;
		int mid;
		while(left < right)
		{
			mid = (left + right) / 2;
			if (A[mid] > key)
			{
				left = mid + 1;
			}
			else if (A[mid] < key) 
                                                                                                                                                                                       			{
				right = mid - 1;
			}
			else
			{
				return mid;
			}
		}

		return -1;
	}
}
