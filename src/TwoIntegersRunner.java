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
		String s = twointegers.Arithmetic();
		int larger = twointegers.Larger();
		boolean isEven = twointegers.isEven();
		boolean isMultiple = twointegers.isMultiple();
		System.out.println(s);
		System.out.println(larger + " is the larger number"); 
		System.out.println("the sum of these numbers is even = " + isEven);
		System.out.println("the second is a multiple of the first = " + isMultiple);
	}
}
