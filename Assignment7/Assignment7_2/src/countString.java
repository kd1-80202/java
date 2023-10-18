import java.util.Scanner;

public class countString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input=sc.nextLine();
		input=input.trim();
		String[] Words=input.split("\\s+");
		int wordCount=Words.length;
		System.out.println("Number of words="+wordCount);
		
	}

}
