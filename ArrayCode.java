import java.util.Arrays;
class ArrayCode{
	public static void main(String[] args){
		int[] arrayNums = new int[5];
		arrayNums[0] = 1;
		arrayNums[1] = 2;
		arrayNums[2] = 3;
		arrayNums[3] = 4;
		arrayNums[4] = 5;
		System.out.println(arrayNums);
		System.out.println(Arrays.toString(arrayNums));
		System.out.println(arrayNums.length);
		
		int arrayNums1[] = { 9, 6, 8, 1, 5, 10, 2, 3, 4, 7};
		System.out.println(arrayNums1);	
		System.out.println(Arrays.toString(arrayNums1));
		//System.out.println(Arrays.sort(arrayNums1));
		System.out.println(Arrays.toString(arrayNums1));
		Arrays.sort(arrayNums1);
		System.out.println(Arrays.toString(arrayNums1));

		int[][] multiArrayNums = new int[2][3]; // 2 rows and 3 columns for multidimensional array.
		multiArrayNums[0][0] = 50;
		System.out.println(Arrays.deepToString(multiArrayNums));
		
		int[][][] multiArrayNums1 = new int[2][3][5]; // 2 rows, 3 columns and lenth of array is 5
		multiArrayNums[1][0] = 100;
		System.out.println(Arrays.deepToString(multiArrayNums1));

		int[][] mulArrNums = { {10, 20, 30}, {40, 50, 60} };
		System.out.println(Arrays.deepToString(mulArrNums));

		final float PI = 3.14F; // final keyword to make it constant and unchangeable.


	}
}