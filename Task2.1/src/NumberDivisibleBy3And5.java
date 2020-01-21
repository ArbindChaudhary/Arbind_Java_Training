
import java.util.Scanner;
public class NumberDivisibleBy3And5 {

	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Number: ");
		number = sc.nextInt();	
			
		
		if((number % 3 == 0) && (number % 5 == 0))
		{
			System.out.println("\n Consultadd JAVA Training"); 
		}
		else if(number % 3==0)
		{
			System.out.println("\n Consultadd"); 
			
		}	
		else if(number % 5==0)
		{
			System.out.println("\n JAVA Training"); 
			}
		else 
		{
			System.out.println("\n invalid number"); 
		}
			
}
}
