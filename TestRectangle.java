import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rectangles to be created");

		int userInput = input.nextInt();

		Rectangle[] rectangleArray = new Rectangle[userInput];

		createRectangles(rectangleArray);

		System.out.println("Here are the rectangles that you created");

		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println("Rectangle " + (i + 1) + ": area: "
					+ rectangleArray[i].getArea() + " : perimeter: "
					+ rectangleArray[i].getPerimeter());

		}

		input.close();
	}

	private static void createRectangles(Rectangle[] rectangleArray) {

		double length, width;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println("Enter rectangle " + (i + 1) + " length");
			length = input.nextDouble();
			System.out.println("Enter rectangle " + (i + 1) + " width");
			width = input.nextDouble();

			rectangleArray[i] = new Rectangle(length, width);

		}

		input.close();
	}

}
