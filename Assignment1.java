import java.util.Scanner;
class Assignment1{
    public static void main(String[] args){
    // 1. Write a Java Program to check if a number is divisible by 7 or not?
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number to check div by 7: ");
	int num = sc.nextInt();
	if (num % 7 == 0){
	    System.out.println(num + " is Divisible by 7.");
	} else{
	    System.out.println(num + " is NOT Divisible by 7.");
	}
    //2. Write a Java Program to check if a number is multiple of 3 not not?
	System.out.print("Entere the number to check multiple of 3: ");
	int num1 = sc.nextInt();
	if (num1 % 3 == 0){
	    System.out.println(num1 + " is multiple of 3.");
	} else{
	    System.out.println(num1 + " is NOT multiple of 3.");
	}
    // 3. Write a program to check if a number is positive or not?
	System.out.print("Enter num to check Pos or Neg: ");
	int num2 = sc.nextInt();
	if (num2 >= 0){
	    System.out.println(num2 + " is a pos num.");
	} else{
	    System.out.println(num2 + " is a neg num.");
	}
    // 4. Write a Java Program to check if a number is having 4 at the unit's place or not?
	System.out.print("Enter the number to check unit num 4 or not: ");
	StringBuilder num4 = new StringBuilder(sc.next());
	if (num4.charAt(num4.length()-1) == '4'){
	    System.out.println(num4 + " has 4 in unit place.");
	} else{
	    System.out.println(num4 + " DOES NOT have a 4 in unit place.");
	}

    // 5. Write a Java Program to check if a number is a 3-digit number or not?
	System.out.print("Enter num to check no. of digit: ");
	String num3 = sc.next();
	if (num3.length() == 3){
	    System.out.println(num3 + " is 3 digit.");
	} else{
	    System.out.println(num3 + " is not 3 digit.");
	}
    //6. Write a Java Program to print even or odd for a given number from CMD/CLA?
	System.out.print("enter num to check Odd or Even: ");
	int num5 = sc.nextInt();
	if (num5 % 2 == 0){
	    System.out.print(num5 + " is Even number.");
	} else{
	    System.out.print(num5 + " is Odd number.");
	}

    }
}