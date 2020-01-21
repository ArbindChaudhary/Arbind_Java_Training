import java.util.Scanner;
public class ZeroPositiveNegative 
{
    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive Small Number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive Large Number");
            }
            else
            {
                System.out.println("Positive Number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative Small Number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative Large Number");
            }
            else
            {
                System.out.println("Negative Number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
