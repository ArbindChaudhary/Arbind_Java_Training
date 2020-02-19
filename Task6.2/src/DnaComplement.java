import java.util.*;
public class DnaComplement {

	

	 public static String makeComplementDNA(String dna_str) {
		dna_str = dna_str.replaceAll("A","Z");
		dna_str = dna_str.replaceAll("T","A");
		dna_str = dna_str.replaceAll("Z","T");
		dna_str = dna_str.replaceAll("C","Z");
		dna_str = dna_str.replaceAll("G","C");
		dna_str = dna_str.replaceAll("Z","G");
		return dna_str;
	  }
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String value:");
		String dna_str=input.nextLine();
		System.out.println(makeComplementDNA(dna_str));
	}
}
