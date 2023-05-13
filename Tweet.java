/*
Tweet.java
Arthur Kroth
10.5.23
*/
public class Tweet{

	//Data Members
	public String text;
	public String negText;
	public StringBuffer strBuff;


	//Objects
	public Tweet(){
		text="";
		negText="";
		strBuff = new StringBuffer();
	}


	//Setters
	public void setText(String text){
		this.text=text;
	}



	//Compute
	public void compute(){
		for(int i=0;i<text.length();i++){
			if(text.charAt(i)==' ' && text.charAt(i+1)=='i' && text.charAt(i+2)=='s' && text.charAt(i+3)==' '){
				strBuff.append(" is not ");
				i = i+3;
			} else {
			strBuff.append(text.charAt(i));
			}
		}
		negText=strBuff.toString();
	}


	//Getters
	public String getNegText(){
		return negText;
	}

}