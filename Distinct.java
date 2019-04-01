import java.util.Arrays;
import java.util.Scanner;


public class Distinct {

	public static void main(String[] args) {
		
		int[]userInput = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i< userInput.length; i++){
			System.out.print("Enter integer " + (i + 1) + ":");
			userInput[i] = input.nextInt();
		}
		
		
		System.out.println("Distinct numbers are: ");
		
		distinctNumbers(userInput,userInput.length);
		
		input.close();
		
		
	}

	private static void distinctNumbers(int[] userInput, int length) {
		Arrays.sort(userInput);
		
		for(int i = 0; i < length; i++){
			while (i < length - 1 && userInput[i] == userInput[i + 1]) 
                i++;
			
			System.out.print(userInput[i] + " ");
		}
	}

}
