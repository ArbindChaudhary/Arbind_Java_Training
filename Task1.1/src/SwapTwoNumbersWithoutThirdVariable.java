import java.util.*;
public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String []s)
	{
		int a,b;
		
		Scanner sc=new Scanner(System.in);    //Scanner class to read value

		System.out.print("Enter the value of first number a: ");
		a=sc.nextInt();
		System.out.print("Enter the value of second number b: ");
		b=sc.nextInt();

		System.out.println("Before swapping the first number  a: "+ a +", the second number b: " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
	
		System.out.println("After swapping the first number   a: "+ a +", the second number b: " + b);
	}
}
