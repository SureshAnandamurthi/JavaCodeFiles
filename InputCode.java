import java.util.Scanner;

class InputCode{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input: ");
		byte userInputAge= scanner.nextByte(); // to take the byte input.  nextFloat, nextDouble overloading methods
		System.out.println(userInputAge);

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String userInputName = scanner1.next(); //.next takes only one token (one word) at a time and wont consider multiple tokens / words after the firstspace. So use nextLine method.
		System.out.println(userInputName);

		Scanner scanner2 = new Scanner(System.in);		
		System.out.print("Enter your full name: ");
		String userNameInput = scanner2.nextLine();
		System.out.println(userNameInput);

		Scanner scanner3 = new Scanner(System.in);		
		System.out.print("Enter your full name with with space prefix and suffix: ");
		String userNameInputSpace = scanner3.nextLine().trim();
		System.out.println(userNameInputSpace);



	}
}