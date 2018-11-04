import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bike{
	private static String brand;
	private static int wheel;
	private static int count;
	private String engNum;
	private String color;
	private String ownerName;
	private String bikeNum;
	//SB
	static{
		System.out.println("\nClass Bike is loaded");
		try{
			Scanner scn = new Scanner(new File("comapnydetails.txt"));
			brand = scn.nextLine();
			System.out.println("brand is initialized with "+brand);
			wheel = scn.nextInt();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}//SB closed
	//NSB 
	{ count ++;} //NSB close
	//parameterized constructor
	public Bike(String engNum, String color){
		if(brand == null){
			throw new RuntimeException("companydetails.txt File is not found");
		}
		this.engNum = engNum;
		this.color = color;
		System.out.println("engNum and color properties are initialized");
	}
	public String getEngNum(){
		return this.engNum;
	}
	public String getColor(){
		return this.color;
	}
	public String getOwnerName(){
		return this.ownerName;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
		System.out.println("ownerName property is initialized");
	}
	public String getBikeNum(){
		return this.bikeNum;
	}
	public void setBikeNum(String bikeNum){
		this.bikeNum = bikeNum;
		System.out.println("bikeNum property is initialized");
	}
	public void start(){
		System.out.println(this.ownerName+"Started Bike"+bikeNum);
	}
	public void move(){
		System.out.println(this.ownerName+"Moving on Bike"+bikeNum);
	}
	
	public void stop(){
		System.out.println(this.ownerName+"Stopped Bike"+bikeNum);
	}
	public static int getCount(){
		return count;
	}
	public void display(){
		System.out.println("Brand :"+this.brand);
		System.out.println("engNum :"+this.engNum);
		System.out.println("color :"+this.color);
		System.out.println("ownerName :"+this.ownerName);
		System.out.println("bikenum :"+this.bikeNum);
	}
}
