class CommandLineInput{
	static String orgName = "ABC Corp";
	int empNo;
	public static void main(String[] args){
		for (int i = 0; i<args.length; i++){
			System.out.println(i);
		}

		int i = 0;
		while (i<args.length){
			System.out.println(args[i]);
			i++;
		}
	}
}