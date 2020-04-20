import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Module_3 {

	public static void main(String[] args) {

	
		Scanner keyboardInput;
		keyboardInput = new Scanner(System.in);

		
		System.out.println("Please input your input file 1 path: ");
		String inputFilePath = keyboardInput.nextLine();
		System.out.println("Input file path: " + inputFilePath);
		
		System.out.println("Please input your input file 2 path: ");
		String inputFilePath1 = keyboardInput.nextLine();
		System.out.println("Input file path: " + inputFilePath1);
		
	
		Scanner fileInput = null;
		Scanner fileInput1 = null;

		
		try {

			fileInput = new Scanner(new FileInputStream(inputFilePath));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	
		
	
		System.out.println("Please input your output file path: ");
		String outputFilePath = keyboardInput.nextLine();
		System.out.println("Output file path: " + outputFilePath);
		System.out.println("*************************************");
		
		

	
		PrintWriter textOutput = null;

		
		try {

			textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}


		String input1 = null;
		String input2 = null;
		

		while (fileInput.hasNext()) {
			
			input1 = fileInput.nextLine();
			
			try {

				fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			
			while (fileInput1.hasNext()) {
			
				
			input2 = fileInput1.nextLine();
			
			if (input1.equals(input2)) {
			
			System.out.println(input1);
			
			textOutput.println(input1);
			
			}
			
			
			
			
			}
			
		}

		
		keyboardInput.close();
		fileInput.close();
		textOutput.close();
	}
}
