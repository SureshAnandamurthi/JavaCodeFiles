class ConstructorEx1{
    int rollNo;
    String stdName;
    int stayFund;
    String location;

    ConstructorEx1(){
	System.out.println("Default Construtor");
    };

    ConstructorEx1(int rollNo, String stdName, int stayFund, String location){
	this.rollNo = rollNo;
	this.stdName = stdName;
	this.stayFund=stayFund;
	this.location = location;
	System.out.println("Parameterized Constructor");
    };

    public static void main(String[] args){
	ConstructorEx1 t1 = new ConstructorEx1(101, "Suresh A", 400000, "BLR");
	ConstructorEx1 t2 = new ConstructorEx1(102, "Neeraj SA", 450000, "BLR");
	ConstructorEx1 t3 = new ConstructorEx1();
	System.out.println(t1.rollNo);
	System.out.println(t1.stdName);
	System.out.println(t1.stayFund);
	System.out.println(t2.rollNo);
	System.out.println(t2.stdName);
	System.out.println(t2.stayFund);
    }

}