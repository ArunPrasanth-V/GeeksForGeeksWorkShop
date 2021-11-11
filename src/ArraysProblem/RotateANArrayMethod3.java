// compare these above two method these method will better

package ArraysProblem;
//the time Complexity will be O(n)..
//space Complexity will be O(1)...
import java.util.Arrays;

//d=2,n=7
//reverse d--> 2 1 3 4 5 6 7
//reverse n-d--> 2 1 7 6 5 4 3 
//reverse whole array-->3 4 5 6 7 1 2
public class RotateANArrayMethod3 {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	int d =8;
	leftRotate(arr,d);
	Arrays.stream(arr).forEach(System.out::println);
}
static void leftRotate(int arr[],int d)
{
	reversed(arr,0,d-1);
	reversed(arr,d,arr.length-1);
	reversed(arr,0,arr.length-1);
}
static void reversed(int arr[],int start,int end)
{
   while(start<end)
   {
	   int temp=arr[start];
	   arr[start]=arr[end];
	   arr[end]=temp;
	   start++;
	   end--;
   }
}
}
