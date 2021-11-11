package ArraysProblem;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_InAnArrayBESTCASE {

	public static void main(String[] args)
	{
	   int N = 6;
	   int A[] = {16,17,4,3,5,2};
	   System.out.println(leaders(A,N));
	}
static ArrayList<Integer> leaders(int arr[], int n)
    {
     ArrayList<Integer> list = new ArrayList<Integer>();
       int max = arr[n-1];
        list.add(max);
        for(int i=n-2; i >=0; i--)
        {
            if(arr[i] >= max)
            {
              list.add(arr[i]);
               max = arr[i];
            }
        }
       Collections.reverse(list);
        return list;

}
}