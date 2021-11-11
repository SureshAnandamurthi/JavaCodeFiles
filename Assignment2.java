public class Assignment2{
    public static void main(String[] args){
    // 6. Write a Java Program to print even or odd for a given number from CMD/CLA?
	int num1 = Integer.parseInt(args[0]);
	if (num1 % 2 == 0){
	    System.out.println(num1 + " is Even Number");
	} else{
	    System.out.println(num1 + " is Odd Number");
	}
    }
}