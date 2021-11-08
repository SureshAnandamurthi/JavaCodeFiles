import java.util.Scanner;
class SwitchCaseDefault{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide your input number 1 or 2 or 3: ");
		int option = sc.nextInt();
		System.out.print("Provide your options 'a' or 'b' or 'c': ");
		char option1 = sc.next().charAt(0);
		switch (option){
			case 1 : {
				System.out.println("Hellow");
				break;
			}
			case 2: {
				System.out.println("Namaste");
				break;
			}
			case 3: {
				System.out.println("Bonjour");
				break;
			}
			default:{
				System.out.println("Invalid Input. Thank you!!!");
			}
		}

		switch (option1){
			case 'a' : 
				System.out.println("Hellow");
				break;
			case 'b' : 
				System.out.println("Namaste");
				break;
			case 'c' : 
				System.out.println("Bonjour");
				break;
			default:
				System.out.println("Invalid option");

		}
	}
}