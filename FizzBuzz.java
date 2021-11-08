import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();
		if ((number % 3) == 0 && (number % 5) == 0){
			System.out.println("FizzBuzz");
		} else if ((number % 3) == 0){
			System.out.println("Buzz");
		} else if ((number % 5) == 0){
			System.out.println("Fizz");
		} else
			System.out.println(number);

		switch (number){
			case (%3 == 0) && (%5 == 0):
				System.out.println("FizzBuaa");
				break;
		//	case (number % 3 == 0):
		//		System.out.println("Buzz");
		//		break;
		//	case (number % 5 == 0):
		//		System.out.println("Fizz");
		//		break;
		//	default:
		//		System.out.println(number);
		}
	
	}
}