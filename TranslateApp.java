/*
TranslateApp.java
Arthur Kroth
10.3.25
*/
import java.util.*;
public class TranslateApp{
	public static void main(String args[]){

		//Variables
		String word="";
		String translatedWord="";


		//Objects
		Scanner keyboard=new Scanner(System.in);
		Translate myTranslate= new Translate();


		//Input
		System.out.println("Please enter the word you want to translate: ");
		word=keyboard.nextLine();
		myTranslate.setWord(word);


		//Compute
		myTranslate.compute();


		//Output
		translatedWord=myTranslate.getTranslatedWord();
		System.out.println("Here is your translated word: "+ translatedWord);

	}
}