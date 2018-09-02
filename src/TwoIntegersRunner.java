import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int value = input.nextInt();
		System.out.println("Enter another number: ");
		int value2 = input.nextInt();
		TwoIntegers twointegers = new TwoIntegers(value, value2);
		String addition = twointegers.Arithmetic();
		String multiplication = twointegers.Arithmetic2();
		String division = twointegers.Arithmetic3();
		String remainder = twointegers.Arithmetic4();
		int larger = twointegers.Larger();
		boolean isEven = twointegers.isEven();
		boolean isMultiple = twointegers.isMultiple();
		int integer1 = twointegers.getInteger1();
		int integer2 = twointegers.getInteger2();
		System.out.println(integer1 + "+" + integer2 + addition);
		System.out.println(integer1 + "*" + integer2 + multiplication);
		System.out.println(integer1 + "/" + integer2 + division);
		System.out.println(integer1 + "%" + integer2 + remainder);
		System.out.println(larger + " is the larger number"); 
		System.out.println("the sum of these numbers is even = " + isEven);
		System.out.println("the second is a multiple of the first = " + isMultiple);
	}
}
