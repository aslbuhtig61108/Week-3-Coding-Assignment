
public class Main1 {

	public static void main(String[] args) {
		System.out.println("1. Create an array of data type int called ages that contains the provided values");
		int[] ages = new int[7];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		
		System.out.println(" a) Subtract the value of the first element of the array from the last element");
		int diffLastFirst = 0;
		diffLastFirst = ages[6] - ages[0];
		System.out.println(diffLastFirst);
				
		
		
		
		System.out.println("2. Create an array of String called names that contain the provided values.");
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Rob";
		
		System.out.println("a) Use a loop to iterate through the array calculating the average number of letters per name.");
				
		int i = 0;
		do {
			System.out.println(names[i] + " : " + names[i].length());
			i++;
		} while (i < names.length);
		
		int j = 0;
		String allNames = " ";
		do {
			allNames += names[j] + " ";
			j++;
		} while (j < names.length);
		
		System.out.print(allNames);
		
		
		// Item 5: Create a new array of int called nameLengths
		int[] nameLengths = new int[7];
		
		
				
	}

}