package ArraysProblem;
//these program the time complexity O(n*n)
//because of for loop
//Space Complexity O(1)..
public class FindEquilibriumPointInArrayMethod1 {

	public static void main(String args[])
	{
		int arr[]= {2,2,9,3,1};
      System.out.println(call(arr,arr.length));
	}
	public static int call(int arr[],int n)
	{
		//
		int leftSum=0;
		int rightSum=0;
		for(int i=0;i<n;i++)
		{
			rightSum=arr[i];
			if(rightSum==leftSum)
			{
				
			}
		}
		return -1;
	}
}
