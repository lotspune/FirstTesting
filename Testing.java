import java.net.*;
import java.io.*;

public class Testing{
	public Testing(){
		try{
			Socket soket = new Socket("localhost",80);
			if(socket.isConnected()){
				System.out.println("socket is connected");
			}else{
				System.out.println("socket is not connected");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		new Testing();
	}
}