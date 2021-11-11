package ArraysProblem;
//common Interview Question in all top Company
public class SearchingBstFindingSquareRootOfNumber {
	//i Donn't know why these program..
public static void main(String args[])
	{
	//method 1:
	//n=25,5;
	//n=27,5
	//n=35,5;
	}
public static void method1(int n) {
	//time complexity -->O(sqrt(n))..these loop will 
	//break  when value of i equal to  squareRoot n
	for(int i=0;i<=n;i++)
	{
		if(i*i==n)
		{
			System.out.println(1);
			break;
		}
		if(i*i>n)
		{
			System.out.println(i-1);
			break;
		}
	}
}
}