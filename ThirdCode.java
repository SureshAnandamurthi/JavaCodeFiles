import java.awt.*;

class ThirdCode{
	public static void main(String[] args){
		byte num1 = 1;
		byte num2 = num1;
		num1 = 5;
		System.out.println(num2);
		// result is still 1 though num2 is referenced num1, both are stored in different memory and are independant as these are primitive data types
		Point point1 = new Point(1, 2);
		Point point2 = point1;
		// In this case the java allocates memory to store Point(1,2) Object. Then the point1 would have the address location of Point Object. Since the point2 Obj is referencing the point1 obj, even point2 holds the address/location of memory.  if the value of Point(1,2)obj gets changed, the same affects the point1 and point2 objects.
		System.out.println(point1);
		System.out.println(point2);
		point1.x = 4;
		point1.y = 5;
		System.out.println("check");
		System.out.println("point1 Obj" + point1);
		System.out.println("point2 Obj" + point2);
	}
}