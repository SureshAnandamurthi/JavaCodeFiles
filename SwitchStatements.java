class SwitchStatements{
	public static void main(String[] args){
	String role = "user";
	// using if statements
	if (role == "admin")
		System.out.println("You're an Admin");
	else if (role == "moderator")
		System.out.println("You're a Moderator");
	else
		System.out.println("You're a Guest");

	// using switch case statements
	switch (role){
		case "admin" :
			System.out.println("You're an Admin");
			break;
		case "moderator":
			System.out.println("You're a Moderator");
			break;
		default:
			System.out.println("You're a Guest");
	}
	}
}

// Divisble by by 5 fizz divisible by 3 buzz divisible for 5 & 3 both fizzbuzz. if not divisible by 5 and 3 print val 