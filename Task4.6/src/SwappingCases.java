import java.util.Scanner;

public class SwappingCases
{

	
		
  static void convertOpposite(StringBuffer str)
  {
     int ln = str.length();
          
     // Conversion using predefined methods
     for (int i=0; i<ln; i++)
     {
         Character c = str.charAt(i);
         if (Character.isLowerCase(c))
             str.replace(i, i+1, Character.toUpperCase(c)+"");
         else
             str.replace(i, i+1, Character.toLowerCase(c)+"");
          
     }
  }
    
  public static void main(String[] args) 

  {
	  Scanner in = new Scanner(System.in);
	    System.out.print("\nInput Enter The Word: ");
		 String Word = in.nextLine();
		 Word = Word.trim();

	  StringBuffer str = new StringBuffer(Word);
                                                       
      convertOpposite(str);
        
      System.out.println(str);
     }
}



