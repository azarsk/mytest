package Resturantprogramee;

public class ResturantData {

	 
	int resturantId;
	String resturantName;
	String foodItem;
	int quantity;
	float itemCost;
	

	ResturantData(String resName, String ResFoodItem, int itemquantity, float itemsCost) {

		resturantName = resName;
		foodItem = ResFoodItem;
		quantity = itemquantity;
		itemCost = itemsCost;
		 
	}

	public void orderItem() {
		System.out.println("-------Order Item---------");
		System.out.println("Resturant Name :" + resturantName);
		System.out.println("Food Item Name :" + foodItem);
		System.out.println("Quantity :" + quantity);
		System.out.println("Cost :" + (itemCost*2));

	}
	public void Payment() {
		System.out.println("-------Payment---------");
		System.out.println("Food Item Name :" + foodItem);
		System.out.println("Quantity :" + quantity);
		System.out.println("Cost :" + (itemCost*2));
	}
	public void sucessMessage() {
		String sucessMessage="Payment Done Sucessfully";
		System.out.println("-------Payment Sucess Message---------");
		System.out.println("Food Item Name :" + foodItem);
		System.out.println("Quantity :" + quantity);
		System.out.println("Cost :" + (itemCost*2));
		System.out.println(sucessMessage);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResturantData resOne = new ResturantData("Mehfil", "biriyani", 2, 220.00f);
		resOne.orderItem();
		resOne.Payment();
		resOne.sucessMessage();
		

	}

}
