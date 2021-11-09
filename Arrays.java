import java.util.Scanner;
class Arrays{
/*
    public static void loops(int[] arr){
	for (int i=0; i<arr.length; i++){
	    System.out.println(arr[i]);
	}

    }
    public static void main(String[] args){
	int[] arr1 = new int[3];
	arr1[0] = 101;
	arr1[1] = 102;
	arr1[2] = 103;
	loops(arr1);
    }

*/
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Array Length: ");
	int num = sc.nextInt();
	int[] newArray = creatArrayLength(num);
	int[] arr1 = updateArray(newArray);
	displayArray(arr1);
	System.out.print("Enter Number to find Index: ");
	int x = sc.nextInt();
	System.out.println(findNumInArray(arr1,x));
    }

    public static int[] creatArrayLength(int length){
	int[] emptyArray = new int[length];
	return emptyArray;
    }
    public static int[] updateArray(int[] array){
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i<array.length; i++){
	    System.out.print("Enter the Value: ");
	    array[i] = scan.nextInt();
	}
	return array;
    }
    public static void displayArray(int[] array){
	for (int i = 0; i<array.length; i++){
		System.out.println(array[i]);
	}
    }
    public static String findNumInArray(int[] array, int x){
	String index = "";
	for (int i = 0; i<array.length; i++){
	    if (array[i] == x){
		index = "The Index is " + i;
		break;
	    } else{
		index = "The value not found.";
	    }
	}
	return index;
    }
}