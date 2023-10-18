

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String input=sc.nextLine();
	if(isPalindrome(input)) {
		System.out.println("String is palindrome");
	}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
	



	private static boolean isPalindrome(String input) {
		
	int left=0,right = input.length()-1;
		while(left<right) {
			if(input.charAt(left)!=input.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		
		}
		return true;
	}

}
