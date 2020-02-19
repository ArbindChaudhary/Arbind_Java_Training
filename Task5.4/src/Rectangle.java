import java.util.Scanner;
public class Rectangle {


	  int length;

	  int breadth;

	  Rectangle()
	  
	  {

		    System.out.println("Constructor with zero parameter called");

		    length=breadth=0;

		  }
	  
	  
	  Rectangle(int side)

	  {

		  	System.out.println("constructor with one parameter called");

		  	length=breadth=side;

	  }

	  
	  Rectangle(int l,int b)

	  {

		  	System.out.println("constructor with two parameters called");

		  	length=l;

		  	breadth=b;

	  }
	  
	  
	  int area()

	  {

		  	return(length*breadth);

	  }

	
	
	public static void main(String[] args)
	{
		                                         
		
		
			Scanner sc = new Scanner(System.in);
        
        
         

			System.out.print("Enter length of 2nd rectangle : ");
			int m = Integer.parseInt(sc.nextLine());
     

		    
		    System.out.print("Enter length of 3rd rectangle : ");
	        int a = Integer.parseInt(sc.nextLine());
	         
	         System.out.print("Enter breadth of 3rd rectangle : ");
	         int b = Integer.parseInt(sc.nextLine());
		   
	         
	         Rectangle r1=new Rectangle();
	         System.out.println("Area of first rectangle="+r1.area());
	         
	         
	        Rectangle r2=new Rectangle(m);
	        System.out.println("Area of sesond rectangle="+r2.area());
	        
	        
		    Rectangle r3=new Rectangle(a,b);

		    System.out.println("Area of third rectangle="+r3.area());

		  }

		

	}


