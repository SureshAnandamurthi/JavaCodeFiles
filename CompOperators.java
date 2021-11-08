class CompOperators{
	public static void main(String[] args){
		int num1 = 1;
		int num2 = 1;
		System.out.println("Equality Operator " + (num1 == num2));
		System.out.println("Not Equal Operator " + (num1 != num2));
		System.out.println("Greaterthan & Equal to Operator " + (num1 >= num2));

		System.out.println("Lesserthan & Equal to Operator " + (num1 <= num2));

		System.out.println("Lesserthan Operator " + (num1 < num2));
		System.out.println("Greaterthan Operator " + (num1 > num2));

		// Logical Operators
		int temperature = 32;
		boolean isWarm = (temperature >= 20) && (temperature <=30);
		System.out.println(isWarm);	

		boolean hasHighIncome = false;
		boolean hasGoodCredit = false;
		boolean hasCriminalRecord = true;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !(hasCriminalRecord);
		System.out.println(isEligible);
		//Conditional statements/if conditions/statements

		int temp = 19;
		if (temp > 30){
			System.out.println("It\'s a hot day");
			System.out.println("Drink Plenty of water");
		} else if (temp >=20 && temp <=30){
			System.out.println("It's warm and nice day");
		} else {
			System.out.println("it's COLD");
				
		}

		//learner way
		//int income = 90_000;
		//boolean hasHighIncome1;
		//if (income > 100_000)
		//	hasHighIncome1 = true;
		//else 
		//	hasHighIncome1 = false;
		
		//System.out.println(hasHighIncome1);

		//bit experienced way
		//int income = 90_000;
		//boolean hasHighIncome1 = false;
		//if (income > 100_000)
		//	hasHighIncome1 = true;		
		//System.out.println(hasHighIncome1);

		//professional way
		int income = 101_000;
		boolean hasHighIncome1 = (income > 100_000);
		System.out.println(hasHighIncome1);


		//Ternary Operators
		int income1 = 99_000;
		String flightClassName = (income1 > 100_000? "First Class" : "Economy Class");
		System.out.println(flightClassName);

	}
}