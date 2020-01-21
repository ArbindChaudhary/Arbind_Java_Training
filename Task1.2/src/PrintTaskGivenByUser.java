import java.util.Scanner;
public class PrintTaskGivenByUser
{

   public static void main(String[] args)
   {
      
       Scanner reader = new Scanner(System.in); // Creates a reader instance 
       System.out.print("Enter a number: ");    // taking input from the user 
       
       int number = reader.nextInt();       // nextInt() reads the next integer from the keyboard
 
       System.out.println("Your entered value is : " + number);
   }
}
