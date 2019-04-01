import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		System.out.println("Enter a series of 5 numbers from 0 to 9.");

		int[] values = new int[5];

		values = getValues();

		int[] lotteryArray = new int[5];

		lotteryArray = getLottery();

		System.out.print("\nThe lottery numbers are: ");

		for (int i : lotteryArray) {
			System.out.print(i + " ");
		}

		int matched = compareNumbers(values, lotteryArray);

		System.out.println("\nYou matched " + matched + " numbers");
		if (matched > 0) {
			System.out.println("The matching numbers are: ");
			printMatchedNumers(values, lotteryArray);
		}

	}

	private static void printMatchedNumers(int[] values, int[] lotteryArray) {
		for (int i = 0; i < values.length; i++) {

			if (values[i] == lotteryArray[i]) {
				System.out.print(values[i] + " ");
			}

		}

	}

	private static int compareNumbers(int[] values, int[] lotteryArray) {

		int matching = 0;

		for (int i = 0; i < values.length; i++) {

			if (values[i] == lotteryArray[i]) {
				matching++;
			}

		}
		return matching;
	}

	private static int[] getLottery() {
		int[] randomNumbers = new int[5];

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 10);
		}

		return randomNumbers;
	}

	private static int[] getValues() {

		int[] getArray = new int[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < getArray.length; i++) {
			System.out.print("Enter number " + (i + 1) + ":");
			getArray[i] = input.nextInt();
		}
		input.close();
		return getArray;

	}

}
