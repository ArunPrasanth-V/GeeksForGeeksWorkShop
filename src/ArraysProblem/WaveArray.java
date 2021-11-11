package ArraysProblem;

import java.util.Arrays;

public class WaveArray {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5};
	wave(arr,arr.length);
	Arrays.stream(arr).forEach(System.out::println);
}
static void wave(int  arr[],int n)
{
   int temp=0;	
   if(n>1)
   {
	   for(int i=0;i<n-1;i++)
	   {
		   
		   if(i%2==0)
		   {
			   temp=arr[i];
			   arr[i]=arr[i+1];
			   arr[i+1]=temp;
		   }
	   }
  }
  
}
}
