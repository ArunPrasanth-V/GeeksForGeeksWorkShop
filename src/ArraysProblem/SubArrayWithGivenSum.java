package ArraysProblem;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
   public static void main(String args[])
   {
	   int arr[]=  {1,2,3,7,5};
	   int s=12;
	  System.out.println(subarray(arr,s,arr.length));
   }
   public static ArrayList<Integer> subarray(int arr[],int s,int n)
   {
	   ArrayList<Integer> mm=new ArrayList<Integer>();
	   int temp=0;
	   int firstval=0;
	   int lastval=0;
	   boolean val=false;
	  for(int i=0;i<n;i++)
	 {
		  firstval=i;
	 	  for(int j=i;j<n;j++)
		  {
			  if(temp!=s)
			  {
			   temp+=arr [j];
			   lastval++;
			  }
			   
	      }
	 	 if(temp==s)
	 	  { val=true;
	 	     break;
	 	  }
	 	  temp=0;
	 	    lastval=i+1;
	 	  
      }
	  if(val==false)
	  {
		  mm.add(-1);
		//System.out.println("No SubArray");  
	  }
	  else
	  {
		  mm.add(firstval+1);
		  mm.add(lastval);
	 	//System.out.println((firstval+1)+" "+(lastval+1));
	  }
	  return mm;
   }
}
