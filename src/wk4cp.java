import java.lang.reflect.Array;

public class wk4cp {

	public static void main(String[] args) {
	//1. array of numbers - numbers
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //created the list
		int resultMinus1 = ages[ages.length -1] - ages[0]; //this created a value that that took the last element and subtracted the first element
		System.out.println(resultMinus1); //sysout
		System.out.println("--------1. continued------");
		int[] ages2 = new int[9];
		ages2[0] = 2;
		ages2[1] = 4;
		ages2[2] = 8;
		ages2[3] = 10;
		ages2[4] = 11;
		ages2[5] = 16;
		ages2[6] = 20;
		ages2[7] = 50;
		ages2[8] = 75;
							//last element 75 // first element
		int result = ages2[ages2.length - 1] - ages2[0]; // 75 - 2 = 3
		System.out.println(result);
	//2. aveage age
		System.out.println("-------- 2. ----------");
		int sum = 0;
		for (int i = 0; i < ages.length; i ++) {
			sum += ages[i];
		}
		double averageAge = (double) sum / ages.length;
		System.out.println("Average age: " + averageAge);
		System.out.println("--------3. -----");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLength = 0;
		
		for (String name : names) {
			totalLength += name.length();
		}
		double averageLetterLength = (double) totalLength / names.length;
		System.out.println("Average numbers of letters: " + averageLetterLength);
		System.out.println("---------------");
		StringBuilder combiningNames = new StringBuilder();
		for (String name : names) {
			if (combiningNames.length() > 0) {
				combiningNames.append(" ");//this adds the space after the name if the sb still has names.
			}
			combiningNames.append(name);
		}
		System.out.println("Combined names: " + combiningNames.toString());
		
	//3. how to find the last element of an array
		System.out.println("--------3-------");
		//int lastE = array[array.length - 1];
		
	//4. how to find the first element of an array
		System.out.println("--------4-------");
		//int firstE = array[0];
		
	//5. creating nameLengths array
		int[] nameLengths = new int[names.length]; //instantiating here
		int lengthSum = 0; //adding index counter, probably don't need this, but for the enhanced for loop why not?
		
		for (int i = 0; i < names.length; i ++) {
			nameLengths[i] = names[i].length();
		} 
		
	//6. Sum of nameLengths
		for (int length : nameLengths) {
			lengthSum += length;
		}
		System.out.println("Sum of all elements in array: " + lengthSum);
		System.out.println("-----------7------------");
		System.out.println(multiplyWord("Hello", 3)); //pulling from the method multiplyWord
		System.out.println("-----------8----------");
		
	//8. not sure, but it works calling the method and combining the names
		String entireName = fullName("Jimmy", "TwoShoes");
		System.out.println(entireName);
		
	//9. sum greater than 100
		System.out.println("-----------9------------");
		int[] numbas = {10, 20, 40, 60, 90};
		System.out.println(sumIsGreaterThan100(numbas));
		System.out.println("-----------10-----------");
		
	//10. average of elements
		double[] avgNumbas = {12, 14, 18, 10};//in order to find average you need to use double datetype, otherwise it will throw an error
		System.out.println(averageOfElements(avgNumbas));
		
		System.out.println("-----------11------------");
		
	//11. 1st greater than 2nd
		double[] arr1 = {10.5, 15.5, 20, 30}; //declared the arrays of double and had it return true if the 1st is greater than the 2nd
		double[] arr2 = {5.5, 30, 20, 10.5};
		System.out.println(isFirstGreaterThanSecond(arr1, arr2));//since we already created a function, I was able to call that method, vs creating a new one
		System.out.println("------------12------------");
	//12. buying a drink
		System.out.println(willBuyDrink(true, 12));//this is letting us know that it is hotoutside and we have more than 10.50 so we are buying a drink.
		
	//13. 
		int curve = 100;
		boolean isHard = javaIsHard(curve);
		System.out.println("Java is hard: " + isHard);
	}

	//these are the methods for the corresponding corresponding questions
	//7.
	
	public static String multiplyWord(String word, int number) {
		StringBuilder result = new StringBuilder();
				for( int i = 0; i < number; i ++) {
					result.append(word);
				}
				return result.toString();
		
	}
	//8. full name returned with space in the middle
	public static String fullName(String first, String last) {
		StringBuilder sb = new StringBuilder();
			sb.append(first + " " + last);//not sure if I did this right, but it works...
			
		return sb.toString();
	}
	
	//9. 
	public static boolean sumIsGreaterThan100(int[] array) { //method that returns true if the sum of all ints in array is > 100;
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum > 100;// this is saying that the sum from the loop is greater than 100, thus returning true
	}
	//10.
	public static double averageOfElements(double[] array) { //boolean method
		double sum = 0; //delcaring sum variable 
		for (double num : array) { //enhanced for loop to add number to itself
			sum += num;
		}
		return sum/array.length; //sum divide by the length of the array
	}
	
	//11.
	public static boolean isFirstGreaterThanSecond(double[] firstArray, double[]secondArray) {
		return averageOfElements(firstArray) > averageOfElements(secondArray);
	
	}
	//12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else 
			return false;
		}
	//13.
	public static boolean javaIsHard(int learningCurve) {
		int scale = 0;
		return learningCurve > scale;
		
		//I created this method because I am excited to learn more java, but man...it sure is hard. Practice practice practice.
	}
	
}
