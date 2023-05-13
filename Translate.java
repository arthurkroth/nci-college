/*
Translate.java
Arthur Kroth
10.3.25
*/
public class Translate{

	//Data Members
	private String word;
	private String translatedWord;
	private StringBuffer strBuff;


	//Objects
	public Translate(){
		word="";
		translatedWord="";
		strBuff = new StringBuffer();
	}


	//Setters - 1 for each input
	public void setWord(String word){
		this.word = word;
	}


	//Compute
	public void compute(){
		char firstChar=word.charAt(0);
		char firstCharLower=Character.toLowerCase(firstChar);

		for(int i=1;i<word.length();i++){
			char ch=word.charAt(i);
			strBuff.append(ch);
		}

			strBuff.append(firstCharLower);
			strBuff.append("ayay");
			translatedWord=strBuff.toString();
	}
	//Getters
	public String getTranslatedWord(){
		return translatedWord;
	}


}