package sorting;
import java.util.*;
public class Practice {

	public static void main(String args[])
	{
		int arr[]= {99,88,77,66,55,44,33,22,11};
		array(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}
	static int[] array(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
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
