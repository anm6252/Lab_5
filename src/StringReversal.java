//Exercise #4
import java.util.*;
import java.util.Scanner;
public class StringReversal {

	
	
	public static void main(String[] args) {
		System.out.println("Enter String:");
		
			Scanner scan = new Scanner(System.in);
			String forward = scan.nextLine();
				System.out.println(forward);
		
		String reverseString = reverseString(forward);
			System.out.println(reverseString);
		
	}		
			
	public static String reverseString(String rev) {
				
				if (rev.isEmpty()) {
					return rev;
				}
				
				return reverseString(rev.substring(1)) + rev.charAt(0);
				
			}
    }

