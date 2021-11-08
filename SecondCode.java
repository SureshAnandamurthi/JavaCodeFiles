import java.util.Date;

class SecondCode{
	public static void main(String[] args){
		byte age = 30;
		System.out.println(age);
		byte myAge = age;
		byte herAge = age;
		System.out.println("my age " + myAge);
		System.out.println("her age " + myAge);
		age = 40;
		System.out.println("age " + age);
		System.out.println("her age " + myAge);
		Date currentDate = new Date();
		System.out.println(currentDate);
	}
}