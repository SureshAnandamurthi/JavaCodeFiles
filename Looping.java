import java.util.Scanner;

class Looping{
	public static void main(String[] args){
		int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("For Looping");
		for (int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
		
		System.out.println("forEach Loop");
		
		for (int num : numbers){
			System.out.println(num);
		}

		System.out.println("While Looping");
		int counter = 0;
		while (counter < 10){
			System.out.println(counter);
			counter++;
		}
	
		System.out.println();
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!(input.equals("quit"))){  //strings are reference types(Not Primitive) as they would have location/address of memory
			System.out.print("Input: ");
			input = scanner.nextLine().toLowerCase();
			if (input.equals("quit"))
				break;
			System.out.println(input);
			
		}

		while (true){  //strings are reference types(Not Primitive) as they would have location/address of memory
			System.out.print("Input: ");
			input = scanner.nextLine().toLowerCase();
			if (input.equals("quit"))
				break;
			System.out.println(input);
			
		}

		do{
			System.out.print("Input: ");
			input = scanner.nextLine().toLowerCase();
			if (input.equals("quit")){
				break;
			}
			System.out.println(input);
		} while (!(input.equals("quit")));
	}
}