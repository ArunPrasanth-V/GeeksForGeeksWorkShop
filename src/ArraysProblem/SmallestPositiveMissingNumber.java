package ArraysProblem;

public class SmallestPositiveMissingNumber {
public static void main(String args[])
{
	int arr[]={1,3,4,5};
	System.out.println(sol(arr,arr.length));
}
public static int sol(int[] arr,int n)
{
	int i=0;
	int temp=0;
	int temp1=0;
	//for(int i=0;i<n;i++)
	while(i<arr.length-1)
	{
	   if(arr[i]>0&&arr[i]<arr.length+1)
	   {
		   temp1=arr[i]-1;
		   if(arr[i]!=temp1)
		   {
			   temp=arr[i];
		   }
	   }
	   i++;
	}
	return temp;
}
}
