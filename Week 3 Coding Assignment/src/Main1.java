
public class Main1 {

	public static void main(String[] args) {
		System.out.println("1. Create an array of data type int called ages that contains the provided values");
		int[] ages = {3, 9, 23, 64, 2, 8, 28};
				
		// System.out.println(" a) Subtract the value of the first element of the array from the last element");
		int diffLastFirst = 0;
		diffLastFirst = ages[6] - ages[0];
		System.out.println("The difference is : " + diffLastFirst);
				
		// System.out.println(" b) Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths");
		int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 72};
		int diffLastFirst1 = 0;
		diffLastFirst1 = ages1[ages1.length-1] - ages1[0];
		System.out.println("Adding a random age, results in: " + diffLastFirst1);
		
		// System.out.println(" c) Use a loop to iterate through the array and calculate the average age. Print the result to the console");
		int result1 = 0;
		for (int age : ages1) {
			result1 += age;
		}
		System.out.println("The average age is : " + result1/ages1.length);
		
				
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
		System.out.println("The average number of letters per name is : " + sumOfLettersPerName/names.length);
		System.out.println("The answer is a whole number becuase we cannot fairly demonstrate a portion of a letter.");
		
		// System.out.println("Use a loop to iterate through the array again and concatenate all the names together");
		// System.out.println("separated by spaces, and print the result to the console.");
		System.out.print("b) " + allNames);

		
		// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		// and add the length of each name to the nameLengths array.
		
				
		
				
	}

}
