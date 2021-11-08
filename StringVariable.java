class StringVariable{
	public static void main(String[] args){
		String message = new String("Hellow World");
		System.out.println(message);
				String message1 = "Hellow World";
				String exclaim = "!!!";
		System.out.println();
		System.out.println(message1 + exclaim);
		System.out.println("lenth of message " + message.length());
		System.out.println(message.length() + exclaim.length());
		System.out.println(message.endsWith("!!"));
		System.out.println(message.startsWith("!!"));
		System.out.println(message.startsWith("Hell"));
		System.out.println(message.indexOf("Hell"));
		System.out.println(message.indexOf("l"));
		System.out.println(message.indexOf("xyz")); // the output would be -1
		String name = "Suresh A";
		System.out.println(message.replace("World", name));
		System.out.println(message.toLowerCase());
		System.out.println(name.toUpperCase());
		String  inputUser = "  abcd  ";
		System.out.println(inputUser);
		System.out.println(inputUser.trim());

		String name1 = "\"Suresh A\"";
		String path1 = "d:\\FullStackDeveloper\\Java\\";
		System.out.println(name1 + " " + "\t" + path1);
		System.out.println(name1 + " " + "\n" + path1);

	}
}