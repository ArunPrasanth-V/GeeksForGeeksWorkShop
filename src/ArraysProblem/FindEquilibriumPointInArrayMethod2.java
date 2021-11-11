//
package ArraysProblem;
//The Equilibrium program is that 
//let take one point the sum of that left all element 
// & the sum of that right  both are equal 

public class FindEquilibriumPointInArrayMethod2{
  public static void main(String args[])
   {
	   int arr[]= {2,2,5,2,2};
// In these program we take 5 left & right sides are equal	   
  System.out.println(equa(arr,arr.length));
   }
   //the time Complexity will be O(n)..
  //we are using only 2 for LOOP
  //Space Complexity Will be O(1)... 
  static int equa(int arr[],int n)
   {
	   int sum=0;
	      int left_sum=0;
	      int i;
	      if(arr.length==1)
	      {
	        //  sum=arr[0];
	          return 1;
	      }
	      else
	      {
	      for(i=0;i<n;i++)
	        sum+=arr[i];//it will sum the whole array
	        for(i=0;i<n;i++)
	        {
	            sum-=arr[i];//less the current index Value
	            if(left_sum==sum)
	            //compare it is equal are not 
	                return i+1;
	                left_sum+=arr[i];
	        }
	      }
	     return-1;
	        
	    }
   }

