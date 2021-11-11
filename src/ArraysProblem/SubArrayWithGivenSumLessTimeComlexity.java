package ArraysProblem;

import java.util.ArrayList;

public class SubArrayWithGivenSumLessTimeComlexity {
public static void main(String args[])
{
	int []arr= {1};
	int s=15;
    System.out.println(doing(arr,arr.length,s));	
}
static ArrayList<Integer> doing(int arr[],int n,int s)
{
	ArrayList<Integer> val=new ArrayList<>();
	int m=0;
	work(arr,n,s,m);
	return val;
}
static void   work(int arr[],int n,int s,int m)
{
	int leftval=0;
	int rightval=0;
	int currentval=0;
	if(m>=n)
	{
		//currentval=-1;
		System.out.println(-1);
	}
	//while(current==s&&current<=s)
	else {
	for(int i=m;i<n;i++)
	{
    		
       if(currentval!=s&&currentval<s)
       {
	    currentval+=arr[i];
	    rightval++;
       }
       else if(currentval==s)
       {
    	   System.out.println(m+" "+rightval);
    	   break;
       }
       else
       {
    	   work(arr,n,s,m++);
       }
	}

	}
}
}
