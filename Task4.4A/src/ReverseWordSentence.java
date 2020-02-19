import java.util.*;
public class ReverseWordSentence
{


    public static void main(String[] args)
    {	
    Scanner in = new Scanner(System.in);
    System.out.print("\nInput Enter The Sentence: ");
	 String sentence = in.nextLine();
	 sentence = sentence.trim();





StringBuilder reverseString = new StringBuilder();
 
String[] words = sentence.split(" ");       //step 1
 
for (String word : words) 
{
    String reverseWord = new StringBuilder(word).reverse().toString();      
    reverseString.append(reverseWord + " ");                                
}
 
System.out.println( reverseString.toString().trim() );
}
}