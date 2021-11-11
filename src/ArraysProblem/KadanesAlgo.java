package ArraysProblem;
//these program is very easy
//it is about find the largest contiguous sub Array
//The Time Complexity O(n)
//The Space Complexity O(1)
public class KadanesAlgo {
public static void main(String args[])
{
	int arr[]= {1,2,2,2,2,-4,3,4,-2,1,2,-2};
	System.out.println(kadanes(arr,arr.length));
}
public static int kadanes(int arr[],int n)
{
	int elemnt=-1;
	for(int i=0;i<n;i++)
	{
		int max=0;
  		if(max<arr[i])
		{
			max+=arr[i];
		}
		if(elemnt<max)
		{
		   elemnt=max;
		}
		}
	return elemnt ;
}
}
