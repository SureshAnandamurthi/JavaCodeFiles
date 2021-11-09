class StrBuilder{
    public static void main(String[] args){
	StringBuilder sb = new StringBuilder("Sumesh");
	StringBuilder lName1 = new StringBuilder("Anandamurthi");
	String lName = " Anandamurthi";
	System.out.println(sb);
	System.out.println(sb.charAt(2));
	sb.setCharAt(2, 'r'); // single quote for Single Char
	System.out.println(sb);
	sb.insert(0,"A."); // double quote for multiple chars
	System.out.println(sb);
	sb.delete(0,2); // end index is excluded	
	System.out.println(sb);
	sb.append(lName);
	System.out.println(sb);
	System.out.println(sb.length());

	for (byte i = 0; i<lName1.length()/2; i++){
		int front = i;
		int back = lName1.length() - 1 - i;

		char frontChar = lName1.charAt(front);
		char backChar = lName1.charAt(back);
		System.out.println("Started reversing");
		lName1.setCharAt(back, frontChar);
		lName1.setCharAt(front, backChar);
	}
	System.out.println(lName1);
    }
}