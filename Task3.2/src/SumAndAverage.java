import java.util.Scanner; 
public class SumAndAverage {

	public static void main(String[] args) 
		
{       
    int i,n=0,sum=0;
	double avg;
	{
	   
        System.out.println("Input your desired 10 numbers : ");  
         
	}
		for (i=0;i<10;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
  		sum +=n;
	}
	avg=sum/10;
	System.out.println("The sum of 10 no is : " +sum+"\nThe Average of the number is : " +avg);
 
}
}