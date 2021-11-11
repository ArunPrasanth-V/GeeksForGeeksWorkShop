package ArraysProblem;
//the time complexity will be O(n)..for Linear
//the space complexity will be O(1)..
public class SearchUsingLinear {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8};
	int n=arr.length;
	int s=6;
	
	// i know linear,binary,ternary Search...Very Great Easy
	for(int i=0;i<n;i++)
	{
		if(arr[i]==6)
		{
			System.out.println(i);
		}
		
	}
}
}
