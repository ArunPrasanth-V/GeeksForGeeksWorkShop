package ArraysProblem;

import java.util.HashSet;
//it is working in less time complexityO(nlogn) 
public class FindFirstRepeatingElemantInAnArray {
public static void main(String args[])
{
	int arr[]= {1, 5, 3, 4, 3, 5, 6};
	System.out.println(firstRepeated(arr,arr.length));
}
public static int firstRepeated(int []arr, int n) 
{
   int min=-1;
   HashSet<Integer> myset=new HashSet<>(); 
   for(int i=n-1;i>=0;i--)
   {
       if(myset.contains(arr[i]))
       {
        min=i+1;
       }
        else
           myset.add(arr[i]);
   }
   
  return min;
}
}
