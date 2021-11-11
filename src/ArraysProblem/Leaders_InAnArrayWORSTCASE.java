package ArraysProblem;
import java.util.*;
//time complexity will be very HIgh 
public class Leaders_InAnArrayWORSTCASE {
public static void main(String args[])
{
	int ardr[]= {13,1,14,2,5,0};
	ArrayList<Integer> arr=new ArrayList<>();
	arr.add(13);
	arr.add(1);
	arr.add(14);
	arr.add(2);
	arr.add(5);
	arr.add(0);
	int n=arr.size();
	System.out.println(leader2(ardr,n));
	
}
static String leader(ArrayList<Integer> arr,int n)
{
	int sum=0;
	int rightsum=0;
		ArrayList<Integer> mm=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		rightsum+=arr.get(i);
	}
	for(int i=0;i<n;i++)
	{
		rightsum-=arr.get(i);
		
			if(arr.get(i)>rightsum)
			{
				mm.add(arr.get(i));
			}
		
	}
	mm.add(arr.get(n-1));
	for(int i=0;i<mm.size();i++)
	{
		System.out.print(mm.get(i)+" ");
	}
	return " ";
}
static ArrayList<Integer> leader2(int[] arr,int n)
{
	int sum=0;
	ArrayList<Integer> mmm=new ArrayList<>();
	ArrayList<Integer> mm=new ArrayList<>();
	int rightsum=0;
	for(int i=0;i<n;i++)
	{
		rightsum+=arr[i];
	}
	for(int i=0;i<n;i++)
	{
		rightsum-=arr[i];
		
			if(arr[i]>rightsum)
			{
				mm.add(arr[i]);
			}
		System.out.println();
	}
	mm.add(arr[n-1]);
	for(int i=0;i<mm.size();i++)
	{
		System.out.print(mm.get(i)+" ");
	}
	
	return mm;
}
}
