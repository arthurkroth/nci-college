/*
Password.java
Arthur Kroth
10.5.23
*/
import java.util.*;
public class PasswordApp{
	public static void main(String args[]){
		//Variables
		String password="";
		String encoded="";


		//Objects
		Scanner keyboard=new Scanner(System.in);
		Password myPassword=new Password();


		//Inputs
		System.out.println("Enter your password: ");
		password=keyboard.nextLine();
		myPassword.setPassword(password);
		keyboard.close();


		//Compute
		myPassword.compute();


		//Output
		encoded=myPassword.getEncoded();
		System.out.println("Your encoded passoword is: "+ encoded);

	}

}