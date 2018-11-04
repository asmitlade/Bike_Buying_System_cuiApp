public class Customer{
	static{
		System.out.println("Class Customer is loaded");
	}
	public static void main(String[] args){
		System.out.println("\nCustomer.main() execution is started");
		System.out.println("\nShowRoom.buy() method is called");
		ShowRoom bajajShowRoom = new ShowRoom();
		Bike bike = bajajShowRoom.buy();
		System.out.println("Back in Customer.main() method");
		System.out.println("Bike object is return to customer \n with engNum, color and ownerName value");
		System.out.println("we must initialize bike object with bikeNum");
		System.out.println("RTO.setBikeNum() method is called");
		RTO kRTO = new RTO();
		kRTO.setBikeNum(bike);
		System.out.println("back in Customer.main() method");
		System.out.println("bike object is fully initialized");
		System.out.println("\nbike object details");
		bike.display();
		System.out.println("\n"+bike.getOwnerName()+"performing bike operations");
		bike.start();
		bike.move();
		bike.stop();
		System.out.println("Customer.main() execution is completed");
	}//main close
}//class close
