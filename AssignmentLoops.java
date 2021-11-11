public class AssignmentLoops{
    // 12. Write a program to print numbers from 1 to 10
    // 13. Write a program to calculate the sum of the first 10 natural numbers.

    public static void main(String[] args){
	System.out.println("For Loop: ");
	int tot1 = 0;
	for (int i=1; i<=10; i++){
	    System.out.println(i);
	    tot1 = tot1 + i;
	}
	System.out.println(tot1);
	System.out.println();
	System.out.println("While Loop: ");
	int i = 1;
	int tot2 = 0;
	while (i<=10){
	    System.out.println(i);
	    tot2+=i;
	    i++;
	    
	}
	System.out.println(tot2);	
	System.out.println();
	System.out.println("Do While Loop: ");
	int tot3 = 0;
	int j = 1;
	do {
	    System.out.println(j);
	    tot3+=j;
	    j++;
	} while (j<=10);
	System.out.println(tot3);
	System.out.println();
	System.out.println("forEach loop: ");
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	int tot4 = 0;
	for (int num : arr){
	    System.out.println(num);
	    tot4+=num;
	}
	System.out.println(tot4);
	System.out.println();
	System.out.println("For loop: ");

	for (int k=15; k>=10; k--){
	    System.out.println(k);
	}
	System.out.println();
	// 14. Write a Java Program to print 15 to 10 numbers using for/while/do while.

	System.out.println("While loop: ");
	int l = 15;
	while (l>=10){
	    System.out.println(l);
	    l--;
	}
	System.out.println();
	System.out.println("Do While loop: ");
	int m = 15;
	do{
	    System.out.println(m);
	    m--;
	} while (m >= 10);

	System.out.println();

	// 15. Write a Java Program to print 1 to 10 even numbers using a while loop.
	int p = 1;
	while (p<=10){
	    if (p % 2 == 0){
		System.out.println(p);
	    }
	    p++;
	}
	System.out.println();
	//16. Write a Java Program to print 1 to 10 odd numbers using a while loop.
	int q = 1;
	while (q<=10){
	    System.out.println(q);
	    q+=2;
	}
	System.out.println();

	// 17. Write a Java Program first ten multiples of 4 using a for loop(4,8,12,16...)

	for (int b = 1; b<=10; b++){
	    System.out.println("4 * " + b + " = " + (b*4));
	}
	System.out.println();
	// 18. Write a Java Program to print a multiplication table of 6 using a for loop.

	for (int b = 1; b<=10; b++){
	    System.out.println("6 * " + b + " = " + (b*6));
	}
	System.out.println();
	//19. Write a Java program to print a multiplication table of 6 using a while loop.
	int c = 1;
	while (c<=10){
	    System.out.println("6 * " + c + " = " + (c*6));
	    c++;
	}
	// 20. Write a Java program Factors of 24 using while loop
	int d = 1;
	while (d <= (24/2)){
	    if (24 % d == 0){
		System.out.println(d);
	    }
	    d++;
	}
	System.out.println(24);
    }
}