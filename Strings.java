class Strings{
	//Strings are immutable
    public static void main(String[] args){
	String fName = "Suresh";
	String lName = "Anandamurthi";
	String fullName = fName + " " + lName;
	System.out.println(fullName);
	for (byte i = 0; i<fullName.length(); i++){
	    System.out.println(fullName.charAt(i));
	}
	String name1 = "Suresh";
	String name2 = "Suresh";
	// compareTo performs 3 comparisons
	// first string > second string returns +ve value
	// first string < second string returns -ve value
	// first string = second string returns 0
	if (name1.compareTo(name2) == 0){
	    System.out.println("Both are same");
	} else
	    System.out.println("Not same");
	//substring method takes 2 arguements start index and end index. End index is nothing but Index-1.
	System.out.println(fullName.substring(7, 13));

	// below not preferred way
	System.out.println("Not a right Way");
	if (name1 == name2){
	    System.out.println("Both are same");
	} else
	    System.out.println("Not same");

	if(new String("abce") == new String("abce")){
	    System.out.println("Both are same");
	} else
	    System.out.println("Not same");
    }
}