import java.util.Scanner;

public class DivisorCalc {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	
	int num1, num2;
		System.out.println("Please Enter 2 Integers");
	
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
		System.out.println("Your Integers: \n" + num1 + "\n" + num2);
		System.out.println("Your Greatest Common Divisor for " + num1 + " and " + num2 + " is " + div(num1, num2));
		
	}
	public static int div(int num1, int num2) {
		
		if (num2 != 0) 
			return div(num2, num1 % num2);
		
		else
				return num1;
		}
		

	}


