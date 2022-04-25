package JavaLinks;

class Bank{
	float getRateOfInterest() {
		return 6.75f;
	}
}
class SBIBank extends Bank {
	float getRateOfInterest() {
		return 5.75f;
	}
	
}
class IcciBank extends Bank{
	float getRateOfInterest() {
		return 7.75f;
	}
	
}
class HdfcBank extends Bank{
	float getRateOfInterest() {
		return 8.75f;
	}
	
}

public class Polymorphism {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBIBank();
		System.out.println("SBIBank"+b.getRateOfInterest());
		b= new IcciBank();
		System.out.println("IcciBank"+b.getRateOfInterest());
	}

}
