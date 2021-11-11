package ArraysProblem;
import java.util.*;
public class RearrangeAnArrayWithO1ExtraSpace {
public static void main(String args[])
{
	//the time complexity will be O(n)
	//the space complexity will be O(1)
	//here  we are combine And do some operation
	long arr[]= {4,3,5,1,0,2};
	int n=arr.length;
	
	for(int i=0;i<n;i++)
     {
	   	 arr[i]+=(arr[(int)arr[i]]%n)*n;
	 }
	for(int i=0;i<n;i++)
	{
		arr[i]/=n;
	}

Arrays.stream(arr).forEach(System.out::println);
}
}
//4 5 7 2 0 1 6 3
