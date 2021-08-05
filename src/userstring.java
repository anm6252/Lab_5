import java.util.*;
import java.io.*;
public class userstring {
	

	public static void main(String[] args) throws Exception {
		
		String file = "userStrings.txt";

			Scanner scan = new Scanner(System.in);
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
			String userStr = "";
			
	while (!userStr.equalsIgnoreCase("DONE")) {
			
		try {
			
			System.out.println("Please write down string. Write 'DONE' when finished writing. \nString: ");
			userStr = scan.nextLine();
				
				if (userStr.equalsIgnoreCase("DONE")) {
					
					outFile.close();
					
	}
				
				outFile.print(userStr);
				
	}
			catch (NumberFormatException exception) {
				
		}
			
	}
		
		scan.close();
		
			System.out.println("File Created: "+ file);
				
	}
	
} 