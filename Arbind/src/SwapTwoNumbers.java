//Writing a Java program to swap two numbers.
import java.util.*;
class SwapTwoNumbers
{
	public static void main(String []s)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);  //Scanner class to read value

		System.out.print("Enter the value of first number a: "); 
		a=sc.nextInt();
		System.out.print("Enter the value of seecond number b: ");
		b=sc.nextInt();

		System.out.println("Before swapping the 1st number - a: "+ a +", The second number b: " + b);
		                    
		int third;              //using the third variable
		third=a;
		a=b;
		b=third;
		
		System.out.println("After swapping the 1st number - a: "+ a +", The second number b: " + b);
	}
}

