import java.util.Scanner;
class ConditionalStatements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Age: ");
		byte age = sc.nextByte();

		if (age >= 18){
			System.out.println(name + " you are an Audult");
		} else
			System.out.println(name + " You are NOT an Adult");
		System.out.println("Using Ternary");
		System.out.println((age >=18)? (name + " you are an Audult") : (name + " You are NOT an Adult"));
		System.out.println((age % 2 ==0)? "Your age is EVEN Number" : "Your age is ODD Number");
	}
}