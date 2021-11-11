package sorting;

public class SquareRootOfNumber {
public static void main(String args[])
{
	int x=23;
	System.out.println(binarySearch(x));
}
static int binarySearch(int x)
{
	int start=1;
	int end=x;
	while(start<= end)
	{
		int mid=(start+end)/2;
		if(mid*mid==0)
		{
			return mid;
		}
		else if(mid*mid>x)
		{
			end=mid-1;
		}
		else
		{
			start=mid+1;
			
		}
		
     }
	return  end ;
}
}