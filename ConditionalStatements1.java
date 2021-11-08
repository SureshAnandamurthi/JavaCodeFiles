import java.util.Scanner;

class ConditionalStatements1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter FirstNumber: ");
		int num1 = sc.nextInt();
		System.out.print("Enter SecondNumber: ");
		int num2 = sc.nextInt();
		System.out.print((num1 == num2)? "Equal\n": "Not Equal\n");

		if (num1 == num2){
			System.out.println("Equal");
		} else{
			if (num1 > num2){
				System.out.println(num1 + " is greater");
			} else{
				System.out.println(num1 + " is lesser");
			}

		}
	}
}