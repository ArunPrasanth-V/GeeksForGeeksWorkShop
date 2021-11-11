package sorting;

import java.util.Arrays;
//the time complexity of bubble sort will be O(n^2)..
public class BubbleSort {
public static void main(String args[])
{
	int arr[]= {8,7,4,3,6,1,5,2,9};
	bubble(arr);
	Arrays.stream(arr).forEach(System.out::println);
}
static int[] bubble(int arr[])
{
	int i,j,n=arr.length;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
			if(arr[j]>arr[j+1])	
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
	}
	return arr;
}
}
