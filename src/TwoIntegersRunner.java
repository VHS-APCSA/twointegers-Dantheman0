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
		String arithmetic = twointegers.Arithmetic();
		String arithmetic2 = twointegers.Arithmetic2();
		String arithmetic3 = twointegers.Arithmetic3();
		String arithmetic4 = twointegers.Arithmetic4();
		int larger = twointegers.Larger();
		boolean isEven = twointegers.isEven();
		boolean isMultiple = twointegers.isMultiple();
		int integer1 = twointegers.getInteger1();
		int integer2 = twointegers.getInteger2();
		System.out.println(integer1 + "+" + integer2 + arithmetic);
		System.out.println(integer1 + "*" + integer2 + arithmetic2);
		System.out.println(integer1 + "/" + integer2 + arithmetic3);
		System.out.println(integer1 + "%" + integer2 + arithmetic4);
		System.out.println(larger + " is the larger number"); 
		System.out.println("the sum of these numbers is even = " + isEven);
		System.out.println("the second is a multiple of the first = " + isMultiple);
	}
}
