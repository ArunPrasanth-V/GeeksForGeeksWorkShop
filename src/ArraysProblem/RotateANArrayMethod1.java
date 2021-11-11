package ArraysProblem;
import java.util.*;
public class RotateANArrayMethod1 {
//The Time Complexity ---> there are 3 for loop so,O(n).
//Space Complexity------>
	//we use extra temp[] so,O(temp.size).
public static void main(String args[])
{

  int arr[]= {1,2,3,4,5,6,7,8,9,10};
  int n=arr.length;
  int d=2;
  int temp[]=new int [d];
  for(int i=0;i<d;i++)
  {
	 temp[i]=arr[i];
  }//8  9 10
  for(int i=0;i<n-d;i++)//10-3=7
  {
	  arr[i]=arr[i+d];//0=0+3=3//1=1+3=4//5
  }
  for(int j=n-d,i=0;j<n;j++)
  {//7=0//8=1//9=2
	  arr[j]=temp[i++];
  }  
  Arrays.stream(arr).forEach(System.out::println);
}
}
