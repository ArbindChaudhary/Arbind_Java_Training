import java.util.Scanner;
public class AddAmount
{

	

    private int amount = 50;

    public AddAmount()
    {

    }

    public AddAmount(int a)
    {
        amount = a+amount;
    }

    public void displayAmount()
    {
        System.out.println(amount);
    }



    public static void main(String[] args)
    {
        AddAmount a = new AddAmount();
        
        
        System.out.print("Enter the number value:: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        AddAmount b = new AddAmount(num);
        System.out.println("The initial amount is : ");
        a.displayAmount();
        
        System.out.println("The final amount is : ");
        b.displayAmount();
    }
}






 