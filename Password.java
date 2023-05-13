/*
Password.java
Arthur Kroth
10.5.23
*/
public class Password{

	//Data Members
	private String password;
	private String encoded;
	private StringBuffer strBuff;


	//Objects
	public Password(){
		password="";
		encoded="";
		strBuff= new StringBuffer();

	}


	//Setters - 1 for each input
    public void setPassword(String password){
		this.password=password;
	}


	//Compute
	public void compute(){
		for(int i=0;i<password.length();i++){
			if(password.charAt(i)=='a' || password.charAt(i)=='e' || password.charAt(i)=='i' || password.charAt(i)=='o' || password.charAt(i)=='u'){
			strBuff.append('*');
			} else {
				strBuff.append(password.charAt(i));
			}
				encoded=strBuff.toString();
		}
	}


	//Getters
	public String getEncoded(){
		return encoded;
	}

}