/*
TweetApp.java
Arthur Kroth
10.5.23
*/
import java.util.*;
public class TweetApp{
	public static void main(String args[]){

		//Variables
		String text="";
		String negText="";


		//Objects
		Scanner keyboard = new Scanner(System.in);
		Tweet myTweet = new Tweet();


		//Input
		System.out.println("Please enter your sentence");
		text=keyboard.nextLine();
		myTweet.setText(text);
		keyboard.close();


		//Compute
		myTweet.compute();


		//Getters
		negText=myTweet.getNegText();
		System.out.println("Converted tweet: "+negText);

	}

}