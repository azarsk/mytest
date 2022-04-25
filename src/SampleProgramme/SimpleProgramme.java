package SampleProgramme;

public class SimpleProgramme {
	String company = "GD";
	String firstname;
	static String lastname = "shaik";
	int d=10;

	public SimpleProgramme(String myFirstname){
		firstname=myFirstname;
		System.out.println(firstname);
	}
	
	public void displayName(String firstname) {
		//this.firstname=firstname;
		System.out.println(firstname);
		System.out.println(this.firstname);
		int d=20;
		System.out.println(d);
		System.out.println(this.d);
	}
	public static void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	public void add() {
		int a=10;
		int b=20;
	    int c=a+b;
	    System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("Test Message");
		sum();//static method
		SimpleProgramme sp = new SimpleProgramme("azar");//creating object and passing values to constuctor method
		System.out.println(sp.company);//instance variables
		System.out.println(lastname);//static variables
		sp.add();//calling instance method
		sp.displayName("azaruddin");
	}

}
