package allTypeOfSearch;

public class TernarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
System.out.println(ternary(arr,arr.length,arr.length-1,0,6));
	}
static	int ternary(int arr[],int n,int last,int first,int k)
	{
		int mid1=first+( last-first);
		int mid2=last-(last-first);
		if(arr[mid1]==k)
		{
			return k;
		}
		else if(arr[mid2]==k)
		{
			return k;
		}
		else if(k<arr[mid1])
		{
			return ternary(arr,n,mid1-1,first,k);
		}
		else if(arr[mid2]>k)
		{
			return ternary(arr,n,last,mid2+1,k);
		}
		  return ternary(arr,n,mid2-1,mid1+1,k);
	}

}