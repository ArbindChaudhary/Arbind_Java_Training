import java.io.*; 
import java.util.*; 


public class Isogram {
 
                                                           
    static boolean is_isogram(String str) 
    { 
                                                            // Convert the string in lower case letters 
        str = str.toLowerCase(); 
        int len = str.length(); 
  
        char arr[] = str.toCharArray(); 
  
        Arrays.sort(arr); 
        for (int i = 0; i < len - 1; i++) { 
            if (arr[i] == arr[i + 1]) 
                return false; 
        } 
        return true; 
    } 
  
                                                                            // driver program 
    public static void main(String[] args) 
    { 
    	 Scanner in = new Scanner(System.in);
         System.out.print("\nInput a word: ");
    	 String word = in.nextLine();
    	
    	
        System.out.println(is_isogram(word)); 
  
       
    } 
} 