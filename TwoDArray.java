import java.util.Scanner;
import java.util.Arrays;
class TwoDArray{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the No. of Rows: ");
	byte rows = sc.nextByte();
	System.out.print("Enter the No. of Columns: ");
	byte cols = sc.nextByte();
	int[][] table = new int[rows][cols];
	for (byte i = 0; i<rows; i++){
	    for (byte j = 0; j<cols; j++){
		System.out.print("Enter the value: ");
		table[i][j] = sc.nextInt();
	    System.out.println();

	System.out.println(Arrays.deepToString(table));
	    }
	}
    }
}