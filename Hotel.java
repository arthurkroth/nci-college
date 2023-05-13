import java.util.*;
public class Hotel {
    //Data Members
    private String surname;
    private String month;
    private int date;
    private double random;
    private StringBuffer strBuff;
    private String bookingID;

    //Objects
    public Hotel(){
        surname="";
        month="";
        date=0;
        random=0.0;
        strBuff = new StringBuffer();
        bookingID="";
    }

    //Setters
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setMonth(String month){
        this.month=month;
    }
    public void setDate(int date){
        this.date=date;
    }
    

    //Compute
    public void compute(){
        strBuff.append(surname.charAt(0));
        strBuff.append(date);
        strBuff.append(month.charAt(0));
        random = Math.floor(Math.random()*10);
        strBuff.append((int)random);

        bookingID=strBuff.toString();
    }

    //Getters
    public String getBookingID(){
        return bookingID;
    }
}
