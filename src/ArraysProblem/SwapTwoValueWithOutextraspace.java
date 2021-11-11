package ArraysProblem;

import java.util.Arrays;

public class SwapTwoValueWithOutextraspace {
public static void main(String args[])
{//very very simple
//x=x+y
//y=x-y
//x=x-y
	int arr[]= {0,1,2,3,4,5,6,7,8,9};
	for(int i=0;i<arr.length;i++)
	{
	if(i%2==0&&arr[i]<arr.length-1)
	  {
		arr[i]+=arr[i+1];;
	    arr[i+1]=arr[i]-arr[i+1];
	    arr[i]-=arr[i+1];
		
	   }
			}
	Arrays.stream(arr).forEach(System.out::println);
}
}
