package sorting;

import java.util.Arrays;

public class InsertionSort {
	//so it compare each element in the Sorted array
//if It Greater Then or not
	
	//the Time Complexity isO(n^2)
public static void main(String args[])
{
	int arr[]= {99,88,77,66,55,44,33,22,11};
	array(arr);
	Arrays.stream(arr).forEach(System.out::println);
}

public static int[] array(int arr[])
{
	for(int i=1;i<arr.length;i++)
	{//6
		int keys =arr[i];
		int j=i-1;//5
		while(j>=0 &&keys<arr[j])
		{
			 arr[j+1] = arr[j]; 
	           j = j-1; 
		}
		arr[j+1]=keys;
	}
	return arr;
}
}
