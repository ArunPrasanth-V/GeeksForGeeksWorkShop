package ArraysProblem;

import java.util.*;


public class Pratice {
public static void main(String args[])
   {
	int arr[]=new int [10];
      System.out.println("Enter the 10 Numbers");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<10;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      
      rearrange(arr);
   }
static int rearrange(int arr[])
{
	int j=0;
	int newarray[]=new int [10];
	for(int i=0;i<10;i++)
	{
		
	if(arr[i]%2!=0)
	{
		newarray[j]=arr[i];
		j++;
	}
	}
	Arrays.stream(newarray).forEach(System.out::println);
	return 0;
	
}
}