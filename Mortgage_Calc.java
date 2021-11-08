import java.text.NumberFormat;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
	// final to make it  constant/immutable/unchangeable and also variable in all caps
	final byte MONTHS_IN_YEAR = 12; 
	final byte PERCENTAGE = 100;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Principal: ");
	int principal = scanner.nextInt();
	
	System.out.print("Annual Interest Rate: ");
	float annualIntrestRate = scanner.nextFloat();
	float monthlyInterestRate = annualIntrestRate / PERCENTAGE / MONTHS_IN_YEAR ;

	System.out.print("Period in Years: ");
	byte years = scanner.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;

	double mortgage = principal
		* (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfPayments))
		/ (Math.pow(1+ monthlyInterestRate, numberOfPayments)-1);

	String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
	//res = mortgageFormatted.format(mortgage);
	System.out.println("Mortgage: " + mortgageFormatted);
    }
}