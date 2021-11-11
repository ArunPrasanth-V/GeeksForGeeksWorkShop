package ArraysProblem;
// its really easy when it is linear
//But,what about time Complexity
//the space is O(1)..
//i Think Time Should Be O(n)..
public class FindMajorityOfElemant {
public static void main(String args[])
{
	int arr[]= {40,85,9,14,53,
			13 ,32
};
	int n=arr.length;
	int x=3;
	int y=33;
	int countx=0;
	int county=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==x)
		{
			countx++;
		}
		else if(arr[i]==y)
		{
			county++;
		}
	}
	if(countx==0&&county==0)
	{
		System.out.println(x);
	}
	
	else if(countx==1&&county==1)
	{
			if(x>y)
			{
				System.out.println(y);
			}
			else
			{
				System.out.println(x);
			}
	}
	else 
	{
		if(countx>county)
		{
			System.out.println(x);
		}
		else if(county>countx)
		{
			System.out.println(y);
		}
	}
}
}
