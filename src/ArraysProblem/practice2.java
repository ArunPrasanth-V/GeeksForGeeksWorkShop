package ArraysProblem;

import java.util.Arrays;

public class practice2 {
public static void main(String args[])
{
	int arr[]= {4,4,3,2,1};
	trap(arr,arr.length);
}
public static void trap(int arr[],int n)
{
   int val;
   for(int i=0;i<n;i++)
   {
	   val=Math.abs(arr[i])-1;
	   if(arr[val]<0)
	   {
		   System.out.println(Math.abs(arr[i]));
		   // it will return absolute value
		   //arr[val]=Math.abs(arr[val]);
	   }
	   arr[val]=-arr[val];
   }
   
   //Arrays.stream(arr).forEach(System.out::println);
}
}
