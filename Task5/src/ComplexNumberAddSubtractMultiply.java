import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComplexNumberAddSubtractMultiply 
{

	                                                 //Java Program to Add, Subtract and Multiply Two Complex Numbers
	 
	
	
	    public static void main(String[] args) 
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        double i1,j1,i2,j2;
	        System.out.println("Enter the real part and imaginary part of the first complex number");
	        try{
	            i1=Double.parseDouble(br.readLine());
	            j1=Double.parseDouble(br.readLine());
	        }catch (Exception e)
	        {
	            System.out.println("An error occurred");
	            return;
	        }
	        System.out.println("Enter the real part and   imaginary part of the second complex number");
	        try{
	            i2=Double.parseDouble(br.readLine());
	            j2=Double.parseDouble(br.readLine());
	        }catch (Exception e)
	        {
	            System.out.println("An error occurred");
	            return;
	        }
	        System.out.println("The first complex number is: " + i1 + " + (" + j1 + ")i");
	        System.out.println("The second complex number is: " + i2 + " + (" + j2 + ")i");
	        
	        System.out.println("The sum of the two complex numbers is :"  + (i1 + i2) + " + (" + (j1 + j2) + ")i");
	        
	        System.out.println("The difference of the two complex numbers is :" + (i1 - i2) + " + (" + (j1 - j2) + ")i");
	        
	        System.out.println("The product of the two complex numbers is :" + (i1 * i2) + " + (" + (j1 * j2) + ")i");
	        
	    }
	    
	}