import java.util.Scanner;
class Input{
	public static void main	(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter you Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your Age: ");
		byte age = scanner.nextByte();
		
		System.out.println("Your Name is " + name);
		System.out.print("your Age is " + age);

	}
}