import java.util.Scanner;

public class Main1 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1. Create an array of data type int called ages that contains the provided values");
		int[] ages = {3, 9, 23, 64, 2, 8, 28};
				
		// System.out.println(" a) Subtract the value of the first element of the array from the last element");
		int diffLastFirst = 0;
		diffLastFirst = ages[6] - ages[0];
		System.out.println("a) The difference is : " + diffLastFirst);
				
		// System.out.println(" b) Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths");
		int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 72};
		int diffLastFirst1 = 0;
		diffLastFirst1 = ages1[ages1.length-1] - ages1[0];
		System.out.println("b) Adding a random age, results in: " + diffLastFirst1);
		
		// System.out.println(" c) Use a loop to iterate through the array and calculate the average age. Print the result to the console");
		int result1 = 0;
		for (int age : ages1) {
			result1 += age;
		}
		System.out.println("c) The average age is : " + result1/ages1.length);
		
				
		System.out.println("2. Create an array of String called names that contain the provided values.");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Rob"};

		//int i = 0;
		//do {
		//	System.out.println(names[i] + " : " + names[i].length());
		//	i++;
		//} while (i < names.length);
		
		int j = 0;
		String allNames = " ";
		int sumOfLettersPerName = 0;
		do {
			sumOfLettersPerName += names[j].length();
			allNames += names[j] + " ";
			j++;
		} while (j < names.length);
		
		// System.out.println("a) Use a loop to iterate through the array calculating the average number of letters per name.");
		System.out.println("a) The average number of letters per name is : " + sumOfLettersPerName/names.length);
		System.out.println("The answer is a whole number becuase we cannot fairly demonstrate a portion of a letter.");
		
		// System.out.println("Use a loop to iterate through the array again and concatenate all the names together");
		// System.out.println("separated by spaces, and print the result to the console.");
		System.out.println("b) " + allNames);

		
		// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		// and add the length of each name to the nameLengths array.
		
		// Previous group of names: names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Rob"};
		int[] nameLengths = new int[names.length];
		
		for (int z = 0; z < names.length; z++ ) {
			nameLengths[z] = names[z].length();
		}
		// Item #5. 
		for (int individualLength : nameLengths) {
			System.out.println(individualLength);
		}
		
		// Item #6.
		int sumOfNameLengths = 0;
		for (int individualLength : nameLengths) {
			sumOfNameLengths += individualLength;
		}
		System.out.println("Item 6) The sum of all elements is : " + sumOfNameLengths);
		
		// Item #7.
		System.out.println("Item 7) output is: " + multiplyMe ("John", 5));
		
		// Item #8.
		String output = bringNamesTogether ("Lani", "Mercado");
		System.out.println("Item 8) output is : " + output);
		
		// Item #9.
		int[] numbers = {5, 18, 9, 52, 27, 5};
		System.out.println("Item 9) output is : " + isSumMoreThan100 (numbers));
		
		// Item #10.
		double[] quizScores = {12.43, 54.32, 87.21, 33.24, 98.11, 17.90, 7.16};
		double finalAnswer = getAverage(quizScores);
		System.out.println("Item 10) output is : " + finalAnswer);
		
		// Item #11.
		double[] quizScores1 = {12.43, 17.32, 20.00, 14.21, 9.24, 13.11}; 
		double[] quizScores2 = {9.00, 11.90, 15.14,  17.90, 7.16, 18.99};
		
		boolean outcome = compareAvgQuizScores(quizScores1, quizScores2);
		System.out.println("Item 11) output is : " + outcome);
				
		// Item #12.
		boolean isHotOutside = true;
		double moneyInPocket = 14.79;
		
		boolean decision = willBuyDrink (isHotOutside, moneyInPocket);
		System.out.println("Item 12) output is : " + decision);
		
		// Item #13.
		System.out.println("Item 13) : My Method");
		// My method will calculate the area of a triangle or circle from user-provided input and returns the area accordingly.
 		// Initiate the user's choice as an integer. Their decision is evaluated accordingly using the simple IF conditional statement.
 
		// Using the menu app video as a form of reference, I placed the intro and user prompts in a method called startProgramGetSelection, 
		// which returns the user's pick and is assigned to int choice
		int choice = startProgramGetSelection();
		String resultSqunit = " ";
		
		// The user's selection is captured and filters through the IF loop 
		// I chose to use two method's to calculate the areas of a triangle and rectangle, respectively, with an exit option  
			if (choice == 1) {
				System.out.print("Please enter the triangle's height : ");
				double height = keyboard.nextDouble();
				System.out.print("Please enter the triangle's base : ");
				double base = keyboard.nextDouble();

		// The triangle area calculation method is invoked here when the user enters '1'
				double computedAreaOfTriangle = solveAreaOfTriangle (height, base);
				System.out.print("Therefore, the area of this triangle is : " + computedAreaOfTriangle + " square feet");
				
			} else if (choice == 2) {
				System.out.print("Please enter the rectangle's length now : ");
				double length = keyboard.nextDouble();
				System.out.print("Please enter the rectangle's width now : ");
				double width = keyboard.nextDouble();

		// The rectangle area calculation method is invoked here when the user enters '2'		
				double computedAreaOfRectangle = solveAreaOfRectangle (length, width);
				System.out.print("Therefore, the area of this rectangle is : " + computedAreaOfRectangle + " square feet");
			
		// To exit the program, I've included an exit option with a simple greeting		
		   } else {
				 System.out.println("Have a good day!");
	
		}
		
	}

	// Method for item#7
	public static String multiplyMe (String word, int n) {
		String result = " ";
		for (int j = 0; j < n; j++) {
			result += word; 
		}
		return result;
	}
	
	// Method for item#8
	public static String bringNamesTogether (String x, String y) {
		String fullName = x + " " + y;
		return fullName;	
	}
	
	// Method for item#9
	public static boolean isSumMoreThan100 (int[] numbers) {
		int result = 0;
		for (int numero : numbers) {
			result += numero;
		}
	if (result > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method for item#10
	public static double getAverage (double[] all) {
		double sum = 0.0;
		double average = 0.0;
		for (double y : all) {
			sum += y; 
		}
		average = sum/all.length;
		return average;
	}
	
	// Method for item#11
	public static boolean compareAvgQuizScores(double[] s1, double[] s2) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		double average1 = 0.00;
		double average2 = 0.00;
		
		for (double s : s1) {
			sum1 += s;
		}
		average1 = sum1 / s1.length;
		
		for (double t : s2) {
			sum2 += t;
		}
		average2 = sum2 / s2.length;
		
		if (average1 > average2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// Method for item#12
	public static boolean willBuyDrink (boolean ans, double myCash) {
		if (ans == true && myCash > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method for item#13
	
	// My attempts to follow a top down method threw me into a confusion, but I managed in the first third of my program.
	public static int startProgramGetSelection() {
		System.out.println("To solve the area of a triangle or rectangle, the appropriate dimensions are required.");
		System.out.print("Please choose the option : 1) Triangle 2) Rectangle or 3) To Exit : ");
		int systemChoice = keyboard.nextInt();
		return systemChoice;				
	}
	
	// Area of triangle is computed by obtaining the product between the height and base dividing the product by 2.
	public static double solveAreaOfTriangle (double xheight, double ybase) {
		double areaOfTriangle = (0.5 * xheight * ybase);
		return areaOfTriangle;
	}
	
	// Area of rectangle is computed by obtaining the product between the length and width (or base).
	public static double solveAreaOfRectangle (double xlength, double ywidth) {
		double areaOfTriangle = (xlength * ywidth);
		return areaOfTriangle;
	}

	
}
	
	
	
	

