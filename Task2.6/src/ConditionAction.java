import java.util.*;
public class ConditionAction 
{

    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int number=sc.nextInt();            
        String ans="";
        if(number%2==1)        // checking for odd 
        {
          ans = "New";
        }
        else {
            if (number >= 2 && number <= 5) {
                ans = "Old";
            } 
            else if (number >= 6 && number <= 30) {
                ans = "New";
            }
            else if (number >30)
            {
                ans = "Old";
            }
            else 
            {
                ans = "Wrong Input";
            }
        
            
        }
        System.out.println(ans);
        
    }
}