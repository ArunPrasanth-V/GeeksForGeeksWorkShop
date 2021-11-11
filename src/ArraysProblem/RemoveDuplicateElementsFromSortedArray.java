package ArraysProblem;
import java.util.*;
public class RemoveDuplicateElementsFromSortedArray {

	
	public static void main(String args[])
	{
		int arr[]= {2,2,2,2,2,2};
		//But the Below Method is not working in geeksforgeeks
/*Arrays.stream(arr)
  .distinct()
  .forEach(System.out::println);*/
		
		//i Need to use Normal ForLoop
		
	 fun(arr);
	}
	public static String fun(int arr[])
	{
		int arrr[]=new int [arr.length];
		boolean bool[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(bool[i]==true)
			{
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
//i want to become a quality coder 
//its my Dream 
//By knowing all the concept
					bool[j]=true;
				}
			}
			System.out.println(arr[i]);	
		}
		return " ";
	}
}

// System.out.println(arr[i]);



