package com.company;

public class Sort
{

	public static void print(String name, int[] unsortedArray, int[] sortedArray)
	{
		System.out.println(name);
		System.out.println(buildString(unsortedArray));
		System.out.println(buildString(sortedArray));
		System.out.println();
	}

	public static String buildString(int[] A)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < A.length; i++)
		{
			sb.append(String.valueOf(A[i]));
			sb.append(" ");
		}
		return sb.toString();
	}

	public int[] insertionSort(int[] A)
	{
		//copy array
		int[] tempArray = A.clone();

		String name = "Insertion Sort";

		// i is the current position being evaluated
		// j is the (current position being evaluated - 1)
		for (int i = 1; i < tempArray.length; i++)
		{
			int current = tempArray[i];
			int j = i - 1;

			//to make insertion sort non-increasing swap "array[j] > current" -> "array[j] < current"
			while (j >= 0 && tempArray[j] > current)
			{
				// swap values for array[j + 1] and array[j]
				int temp = tempArray[j];//
				tempArray[j] = tempArray[j + 1];
				tempArray[j + 1] = temp;

				//move to the left in the sorted array
				j--;
				tempArray[j + 1] = current;
			}
		}

		print(name,A,tempArray);
		return tempArray;
	}

	//Best: 0(n)
	//Worst: omega(n^2)
	public int[] bubbleSort(int[] A)
	{
		int[] tempArray = A.clone();
		String name = "Bubble Sort";

		for (int i = 0; i < tempArray.length-1; i++)
		{
			for (int j = tempArray.length-1; j > 0; j--)
			{
				if(tempArray[j] < tempArray[j-1])
				{
					//swap tempArray[j] with tempArray[j-1]
					int temp = tempArray[j];
					tempArray[j] = tempArray[j-1];
					tempArray[j-1] = temp;
				}
			}
		}
		print(name,A,tempArray);
		return tempArray;
	}

	//Best: O(n log(n))
	//Worst: omega(n log(n))
	//better than insertion sort for large datasets
	public void mergeSort(int[] a, int n) {
		System.out.println(buildString(a));
		if(n < 2)
		{
			return;
		}

		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int [n - mid];

		for (int i = 0; i < mid; i++)
		{
			left[i] = a[i];
		}

		for (int i = mid; i < n ; i++)
		{
			right[i - mid] = a[i];
		}

		//sort the left half
		mergeSort(left,mid);

		//sort the right half
		mergeSort(right, n - mid);

		//do the last step
		merge(a,left,right,mid,n-mid);
		System.out.println(buildString(a));
	}

	private void merge(int[] a, int[] l, int[] r, int left, int right){
		
		int i = 0;
		int j = 0;
		int k = 0;

		//while we are not to the end of the array lengths
		while(i < left && j < right)
		{
			//determine sort order
			if(l[i] <= r[j])
			{
				a[k] = l[i];
				k++;
				i++;
			}
			else{
				a[k] = r[j];
				k++;
				j++;
			}
		}

		while (i < left) {
			a[k] = l[i];
			k++;
			i++;
		}
		while (j < right) {
			a[k] = r[j];
			k++;
			j++;
		}
	}
}
