import java.util.Scanner;
public class Calculator {

    public static void main(String args[])
    {
        Float a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
		
        do
        {
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Division\n");
            System.out.print("4. Multiplication\n");
            System.out.print("5. Average\n");
            System.out.print("6. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' : 
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                    res = a + b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 1 is returning negative answer");
                    }
                    else
                    {
                    System.out.print("Result = " + res);
                    }
                    break;
                case '2' : 
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                    res = a - b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 2 is returning negative answer");
                    }
                    else
                    {
                    System.out.print("Result = " + res);
                    }
                    break;
                case '3' : 
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                    res = a / b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 3 is returning negative answer");
                    }
                    else
                    {
                    System.out.print("Result = " + res);
                    }
                    break;
                case '4' : 
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
                   
                    res = a * b;
                    if (res<0)
                    {
                    	 System.out.println("Result = " + res);
                    	System.out.println("Oops option 4 is returning negative answer");
                    }
                    else
                    {
                    
                    System.out.print("Result = " + res);
                    }
                    break;
                case '5' : 
                	System.out.print("Enter The First Number ");
                	a = scan.nextFloat();
                	System.out.print("Enter The second Number ");
                	b = scan.nextFloat();
               
                    res =(a + b)/2;
                    if (res<0)
                    {
                	 System.out.println("Result = " + res);
                	System.out.println("Oops option 5 is returning negative answer");
                    }
                    else
                    {
                
                    System.out.print("Result = " + res);
                    }
                    break;
                case '6' : 
                	System.exit(0);
                    break;
                    default : System.out.print("Wrong Choice choose from 1 to 6!!!");
                    break;
            }
            System.out.print("\n-------------------------------------------\n");
        }
        while(choice != 6);       
    }
}