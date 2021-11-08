import java.text.NumberFormat;

class ArithmaticCode{
	public static void main (String[] args){
		int res1 = 10 + 3;
		System.out.println(res1);
		int res2 = 10 - 3;
		System.out.println(res2);

		int res3 = 10 * 3;
		System.out.println(res3);
		int res4 = 10 / 3;
		System.out.println(res4);
		// result is 3.  But if to have even the decimals factored, need to convert the values explicitly to Double.

		double res5 = (double) 10 / (double) 3;
		System.out.println(res5);

		int num1 = 10;
		num1++; // suffix
		System.out.println(num1);
		int num2 = 15;
		++num2; // prefix
		System.out.println(num2);
		int num3 = ++num2;
		System.out.println(num3);
		int num4 = num1++;
		System.out.println(num4);

		String strNum = "55";
		System.out.println(Integer.parseInt(strNum)); // Integer is wrapper class.  Similarly Short, Byte, Float, Double wrapper classes are there.

		int resul = Math.round(1.11F); // Floating to int.
		System.out.println(resul); // output is 1
		int resul1 = (int)Math.ceil(1.11f);
		System.out.println(resul1);
		int resul2 = (int)Math.floor(1.23344f);
		System.out.println(resul2);
		float floatNum = Math.min(1.5f, 100.2834798F);
		System.out.println(floatNum);
		float floatNum1 = Math.max(1.5f, 100.2834798F);
		System.out.println(floatNum1);

		byte randomNum = (byte)(Math.random() * 100);  //random returns random float number b/w 0 to 1
		System.out.println(randomNum);

		// Number formatting
		NumberFormat curr = NumberFormat.getCurrencyInstance();		//Factory method as Numberformat is Abstract Method.  Can't be instancetiated.
		String result = curr.format(123343546.656564);
		System.out.println(result);
		System.out.println(NumberFormat.getCurrencyInstance().format(3439749379.345435));  //Methods Chaining.

		NumberFormat percentVal = NumberFormat.getPercentInstance();
		String result1 = percentVal.format(0.275F);
		System.out.println(result1);
		System.out.println(NumberFormat.getPercentInstance().format(0.978));  //Methods Chaining.
		

	}
}