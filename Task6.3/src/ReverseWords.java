import java.util.*;

public class ReverseWords{
	public static void revereEachWord(String str){
		
		Stack<Character> s=new Stack<Character>();
		for (int i = 0; i < str.length(); ++i) { 
			if (str.charAt(i) != ' ') {
				s.push(str.charAt(i)); 
			}
			else { 
				while (s.empty() == false) { 
					System.out.print(s.pop());      
				} 
				System.out.print(" "); 
			} 
		} 
		while (s.empty() == false) { 
			System.out.print(s.pop()); 
			
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String value:");
		String str=input.nextLine();
		revereEachWord(str);
	}
}
