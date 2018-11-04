import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RTO{
	private static long bikeNumSeq;
	static{
		System.out.println("\nClass RTO is loaded");
		//reading bikeNumSeq from a file
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("bikeNumSeq.txt"));
			bikeNumSeq = dis.readLong();
			//dis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("bikeNumSeq is initialized with");
	}//SB close
	public void setBikeNum(Bike bike){
		System.out.println("RTO.setBikeNum() execution is started");
		bike.setBikeNum("MH 36 J"+ ++bikeNumSeq);
		System.out.println("bikeNum is stored in bike object");
		try{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("bikeNumSeq.txt"));
			dos.writeLong(bikeNumSeq);
			dos.flush();
			dos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("RTO.setBikeNum() execution is completed");
		System.out.println("bike object is return to class Customer");
	}//sBN() method is close
}//class close