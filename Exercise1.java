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
	System.out.print(posnegcheck);
	System.out.print("Enter num for unit place check: ");
	String num4 = Integer.toString(sc.nextInt());
	String unit4num = unitNum(num4);
	System.out.print(unit4num);
	System.out.print(unit4num.getClass());
	System.out.println(unit4num);

    }

    public static String unitNum(String str){
	if (str[str.length()-1] == '4')
	    return str + " has 4 in unit place";
	else
	    return str + " Does have 4 in unit place";
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