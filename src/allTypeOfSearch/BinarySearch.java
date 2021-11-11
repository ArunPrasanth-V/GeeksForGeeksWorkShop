package allTypeOfSearch;

public class BinarySearch {
  public  static void main(String args[])
  {
	  int arr[]= {1,2,3,4,5,6,7,8,9,10};
	  System.out.println(binary( arr,arr.length,5));
  }
  public static int   binary(int arr[],int n,int k)
  {
	  int first=0,last=arr.length-1;
	 while(last>=first)
	 {
		 int mid=first+(last-first);
		 if(arr[mid]==k)
		 {
			 return k;
		 }
		 else if(arr[mid]>k)
		 {
			 last=mid-1;
		 }
		 else
		 {
			 first=mid+1;
		 }
	 }
	 return -1;
  }
}
