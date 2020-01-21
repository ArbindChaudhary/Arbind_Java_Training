import java.util.Scanner;
public class CharacterInput
{

	public static void main(String[] args)
   {
	
      System.out.println("Enter a Character :");
      Scanner sc = new Scanner(System.in);
     
      char ch = sc.next().charAt(0);
      if(ch == 'r'|| ch == 'a'|| ch == 'n' ||ch == 'd' ||ch == 'o'|| ch=='m' ||ch == 'R'|| ch == 'A'|| ch == 'N' ||ch == 'D' ||ch == 'O'|| ch=='M' ||ch == ' ')
      {
         System.out.println("Alphabet Found");
      }
      else
      {
         System.out.println("Alphabet Not Found");
      }
   }
}