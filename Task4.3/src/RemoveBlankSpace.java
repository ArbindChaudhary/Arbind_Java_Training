import java.util.Scanner;
public class RemoveBlankSpace {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		    String line;
		    System.out.print("Sentence: ");
		    line = scanner.nextLine();
		    char phrase[] = line.toCharArray();
		    String result = "";

		    for (int i = 0; i < phrase.length; i++) {
		        if (phrase[i] != ' ') {
		            result += phrase[i];
		        }           
		    }

		    System.out.println(result);
		}
}