import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class CSV_Read {

	public static void main(String[] args) throws Exception {
		
	String filePath = "src\\input.csv";
		File file = new File(filePath);
		
	System.out.println("Maximum Values: ");
	try {
			Scanner scan = new Scanner(file);
		
		while (scan.hasNext()) {
			String input1 = scan.next();
			String [] val1 = input1.split(",");
	          int maxVal = Integer.parseInt(val1[4/1]);
	           
	          System.out.println(maxVal);
		}
	       
		scan.close();
		
	}
	catch (FileNotFoundException e) {
	
	}

	}
}


