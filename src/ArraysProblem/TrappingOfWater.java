package ArraysProblem;
//Very Very Easy Program.!!!!
public class TrappingOfWater
{
//these program make sense	
  public static void main(String args[])
  {
	  int []arr= {4,0,4,0,2,1};
	  System.out.println(totalWater(arr,arr.length));
	  
  }

static int totalWater(int hight[],int n)
 {
    if(hight==null||hight.length==0)
	{
		return 0;
	}
	int result =0,level=0,l=0,r=hight.length-1;
	while(l<r)
	{
			int lower=hight[hight[l]<hight[r]?l++:r--];
			level=Math.max(level, lower);
			result+=level-lower;
			//
	}
	 return result; 
 }
}
