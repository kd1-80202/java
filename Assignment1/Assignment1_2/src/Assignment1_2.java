import java.util.Scanner;

public class Assignment1_2{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1= ");

		if (sc.hasNextDouble() != sc.hasNextInt()) {
			double num1 = sc.nextDouble();
			System.out.println("Enter the value of num2= ");
			if (sc.hasNextDouble() != sc.hasNextInt()) 
			{
				double num2 = sc.nextDouble();
				double avg = (num1 + num2) / 2;
				System.out.println("avg =" + avg);
			} else {
				System.out.println("Not a double no");
			}
		}
		 else
		{
			System.out.println("Invalid");
		}
		sc.close();
	}
}
