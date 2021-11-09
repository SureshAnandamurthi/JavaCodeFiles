import java.util.Scanner;
class Circle{
    final static double PI = 3.14;
    public static double calcArea(int radius){
	return (Circle.PI * Math.pow(radius,2));
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Radius: ");
	int radius = sc.nextInt();
	System.out.println(calcArea(radius));
    }
}