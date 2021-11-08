import java.text.NumberFormat;
import java.util.Scanner;
class MortgageCalculator{
	public static void main(String[] args){
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		int principal = 0;
		float annualInterest = 0;
		int numberOfPayments = 0;
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Principal: ");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <=1_000_000)
				break;
			System.out.println("Enter value b/w 1K to 1M: ");
		}


		while(true){
			System.out.print("Annual Interest Rate: ");
			annualInterest = scanner.nextFloat();
			if (annualInterest >=1 && annualInterest <=30){
				float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter the value b/w 1 to 10");
		}
		while (true){
			System.out.print("Period (Years): ");
			byte years = scanner.nextByte();
			if (years>=1 && years <=30){
				numberOfPayments = years * MONTHS_IN_YEAR;
				break;	
			}
			System.out.println("Enter a value 1 to 30")
		}
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest	
	}
}