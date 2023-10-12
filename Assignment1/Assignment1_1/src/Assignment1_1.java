import java.util.Scanner;

public class Assignment1_1 {
  public static void main(String [] args)
  {
	  int num1 ;
  	  Scanner sc=new Scanner(System.in);
  	  System.out.println("Enter number= ");
  	  num1=sc.nextInt();
  	  System.out.println("Given Number ="+num1);
  	System.out.println("Binary Equivalent="+Integer.toBinaryString(num1));
  	System.out.println("Octal Equivalent ="+Integer.toHexString(num1));
  	System.out.println("Hexadecimal Equivalent="+Integer.toOctalString(num1));
  }
  
}
