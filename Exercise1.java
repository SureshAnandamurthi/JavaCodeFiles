import java.util.Scanner;
class Exercise1{
    public static void main(String[] args){
	//int num = Integer.parseInt (args[0]);
	//System.out.println(num);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num for Div7 check: ");
	int num1 = sc.nextInt();
	String div7 = Div7(num1);
	System.out.println(div7);
	System.out.print("Enter num for Mul3 check: ");
	int num2 = sc.nextInt();
	String mul3 = Multiple3(num2);
	System.out.println(mul3);
	System.out.print("Enter num for Pos/Neg check: ");
	int num3 = sc.nextInt();
	String posnegcheck =posNegCheck(num3);
	System.out.println(posnegcheck);
	System.out.print("Enter num for unit place check: ");
	StringBuilder num4 = new StringBuilder(sc.next());
	System.out.println(num4.getClass());
	//System.out.println(num4.length());
	String unitNum4 = unitNum(num4);
	System.out.println(unitNum4);
	String digitcheck = digitCheck(num4);
	System.out.println(digitcheck);
	int num5 = Integer.parseInt(num4.toString());
	//System.out.println(num5);
	String oddevencheck = oddEven(num5);
	System.out.println(oddevencheck);
	System.out.println("All done");
	System.out.println(maxOfnums(num1, num2, num3) + " is greater");
	System.out.println(minOfnums(num1, num2, num3) + " is smaller");

    }


    public static int maxOfnums(int num1, int num2, int num3){
		int check = Math.max(num1, num2);
		return Math.max(check, num3);
    }
    public static int minOfnums(int num1, int num2, int num3){
		int check = Math.min(num1, num2);
		return Math.min(check, num3);
    }

    public static String oddEven(int num){
	return (num % 2 == 0)? num +" is Even Num" : num +" is Odd Num";
    }

    public static String digitCheck(StringBuilder str){
	return str +" has " + str.length() + " digits.";
    }

    public static String unitNum(StringBuilder str){
	if(str.charAt(str.length()-1) == '4')
	    return str + " has 4 in unit place.";
	else
	    return str + " does not have 4 in unit place.";
    }

    public static String posNegCheck(int num){
	if (num == 0){
	    return num + " is ZERO.";
	}else if (num > 0)
	    return num + " is Positive.";
	else
	    return num + " is Negative.";
    }

    public static String Multiple3(int num){
	if (num % 3 == 0)
	    return num + " is Multiple of 3";
	else
	    return num + " is NOT multiple of 3";
    }

    public static String Div7(int num){
	if (num % 7 == 0){
	    return num + " is Divisible by 7.";
	}else {
	    return num + " is NOT Divisible by 7.";
	}
    }
}