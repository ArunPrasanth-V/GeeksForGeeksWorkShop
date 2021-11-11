package ArraysProblem;

import java.util.Arrays;

//here we are not using the extra space...

public class RotateANArrayMethod2 
{
	//Space Complexity-->O(1)
	//time Complexity-->(n*d)
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	//System.out.println(n);
    int d=5;
    int temp1;
 
    
    for(int i=0;i<d;i++)//O(d)
	{
    	rotate(arr,n);//O(n)
	}
    
    Arrays.stream(arr) .forEach(System.out::println);
}
static void rotate(int arr[],int n)
{
	int temp=arr[0];
	for(int i=0;i<n-1;i++)
	{
		arr[i]=arr[i+1];
	}
	arr[n-1]=temp;
}
}
