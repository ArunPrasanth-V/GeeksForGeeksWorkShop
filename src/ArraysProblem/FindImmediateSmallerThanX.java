package ArraysProblem;
/*For a given value 16, there
are four values which are smaller than
it. But 15 is the number which is smaller
and closest to it with minimum difference
of 1.*/
public class FindImmediateSmallerThanX {
	//Expected Time Complexity: O(N)
	//Expected Auxiliary Space: O(1)


public static void main(String args[])
{
	        int N = 5;
			int arr[] = {1,2,3,4,5};
			int X = 1;
			immediateSmaller(arr,N,X);
}
public static int immediateSmaller(int arr[], int n, int x)
{
    int currenttemp=-1;
  for(int i=0;i<n;i++)
  {
      if(arr[i]<x&&arr[i]>currenttemp)
      {
          currenttemp=arr[i];
      }
  }
  return currenttemp;
}
}
