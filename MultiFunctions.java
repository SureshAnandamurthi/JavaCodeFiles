import java.util.Scanner;
class MultiFunctions{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = sc.nextLine();
		printName(name);
		System.out.print("Enter FirstNumber: ");
		byte num1 = sc.nextByte();
		System.out.print("Enter SecondNumber: ");
		byte num2 = sc.nextByte();
		int total = addNumbers(num1, num2);
		System.out.println(total);
		System.out.print("Enter the number to findout the Factorial: ");
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	public static void printName(String name){
		System.out.println(name);
		return;
	}

	public static int addNumbers(byte num1, byte num2){
		return (num1 + num2);
	}

	public static int factorial(int n){
		int facto = 1;
		if (n < 0){
			System.out.println("Invalid Input");
			return n;
		}else
			for (int i = n; i>=1; i--){
				facto*= i;
			}
		return facto;
	}
}