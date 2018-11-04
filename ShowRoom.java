import java.util.Scanner;

public class ShowRoom{
	private Scanner scn;
	private Factory bajaj; //for maintaining factory obj
	private Bike[] bikes; //for maintaining bike in showroom
	private int index; // for maintaining bike index to sell
	static{
		System.out.println("\nClass ShowRoom is loaded");
	}
	public ShowRoom(){
		scn = new Scanner(System.in);
		bajaj = new Factory();
		bikes = bajaj.getBikes(10);
		index = 0;
	}
	public Bike buy(){
		System.out.println("ShwRoom.buy() execution is started");
		if((bikes == null)||(index == bikes.length)){
			bikes = bajaj.getBikes(10);
		}
		Bike bike = bikes[index];
		System.out.println("Customer has selected one bike");
		System.out.println("Registering bike on this customer name");
		System.out.println("Enter Owner Name :");
		bike.setOwnerName(scn.nextLine());
		System.out.println("Removing bike from Showroom");
		bikes[index] = null;
		System.out.println("Customer has taken, bike out from Showroom");
		System.out.println("showroom.buy() execution is completed");
		System.out.println("Bike object is return to class Customer");
		index ++;
		return bike;
	}// buy() method close
}// class close
