import java.util.*;
public class RemoveVowels
{


	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of String");
		String str=input.nextLine();
		String removeVowels=str.replaceAll("[aeiouAEIOU]","");
		
		System.out.println("\tThe String after removing vowels is ");
		System.out.println(removeVowels);
	}
}
