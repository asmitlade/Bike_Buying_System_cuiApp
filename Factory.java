import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Factory{
	private static long engNumSeq;
	static{
		System.out.println("\nClass Factory is loaded");
		//reading engNumSeq from a file
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("engNumSeq.txt"));
			engNumSeq = dis.readLong();
			dis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("engNumSeq is initialized with"+engNumSeq);
	}//SB closed 
	Bike[] getBikes(int noOfBikes){
		System.out.println("factory.getBike()execution is started");
		Bike[] bikes = new Bike[noOfBikes];
		for(int index = 0; index < noOfBikes; index++){
			String engNum = "ABC123PQ"+ ++engNumSeq;
			String color;
			if((engNumSeq%2)== 0){
				color = "RED";
			}
			else{
				color = "YELLOW";
			}
			bikes[index] = new Bike(engNum, color);
		}//for close
		//storing engNumSeq in a file
		try{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("engNumSeq.txt"));
			dos.writeLong(engNumSeq);
			dos.flush();
			dos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(noOfBikes+"bikes are manufactured");
		System.out.println("factory.getBike() execution is completed");
		System.out.println("Bike objects are returned to class ShowRoom");
		return bikes;
	}//getBike() close
}//class close
