import java.util.Scanner;
import java.util.Arrays;
class Loops{
/* 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the natural Number: ");
		int num = sc.nextInt();
		int tot = 0;
		for (int i = 1; i<= num; i++){
			tot+=i;
		}
		System.out.print("Total is " + tot);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		byte num = sc.nextByte();
		for (byte counter = 1; counter<=10; counter++){
			System.out.println(num + " * " + counter + " = " + (num*counter));
		}
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find all the EVEN numbers till that number: ");
		byte num = sc.nextByte();
		for (byte i=1; i<=num; i++){
			if (i % 2 == 0){
				System.out.println(i + " Even Number");
			} else
				continue;
		}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		byte button = 1;
		byte stdCounter = 0;
		do {
			System.out.print("Enter the Student Marks: ");
			byte stdMarks = sc.nextByte();
			if (stdMarks >= 90)
				System.out.println("This is Very Good");
			else if (stdMarks >= 60)
				System.out.println("This is Good");
			else if (stdMarks >= 40)
				System.out.println("This is Average");
			else
				System.out.println("NOT GOOD AT ALL");
			stdCounter++;
			System.out.print("Enter 1 to continue and 0 to stop: ");
			button = sc.nextByte();
		} while (button == 1);
	}
*/

	public static void main(String[] args){
		byte rows = 4;
		byte columns = 4;
		System.out.println();		
		for (byte i=1; i<=rows; i++){
			for (byte j=1; j<=columns; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (byte i=1; i<=rows; i++){
			for (byte j=1; j<=columns; j++){
				if (j == 1 || j == columns || i == 1 || i == rows) 
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println();
		for (byte i = 1; i<=rows; i++){
			for (byte j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
		for (byte i = 1; i <=rows; i++){
			for (byte j=1; j <=(rows+1)-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();		
		for (byte i = rows; i>=1; i--){
			for (byte j=1; j <=(rows+1)-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (byte i = 1; i<=rows; i++){
			for (byte j = 1; j<=(rows-i); j++){
				System.out.print(" ");
			}
			for (byte k = 1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for (byte i = rows; i>=1; i--){
			for (byte j = 1; j<=(rows-i); j++){
				System.out.print(" ");
			}
			for (byte k = 1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		byte rows1 = 5;
		byte i;
		byte j;
		for (i = 1; i<=rows1; i++){
			for (j = 1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (i=1; i<=rows1; i++){
			for (j=1; j<=(rows1-i+1); j++){
				System.out.print(j);
			}
			System.out.println();
		}		

		System.out.println();
		byte count = 1;
		for (i=1; i<=rows1; i++){
			for (j=1; j<=i; j++){
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println();

		for (i=1; i<=rows1; i++){
			for (j=1; j<=i; j++){
				System.out.print(((i+j)%2 == 0)? 1 : 0);	
			}
			System.out.println();
		}			
	}
}