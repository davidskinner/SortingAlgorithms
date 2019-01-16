package com.company;

public abstract class Sort implements ISort
{

	public static void print(String name, String unsortedArrayString, String sortedArrayString)
	{
		System.out.println(name);
		System.out.println(unsortedArrayString);
		System.out.println(sortedArrayString);
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

	public abstract int[] sort();

}
