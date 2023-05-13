import java.util.*;
public class HotelApp {
    public static void main(String args[]){
        boolean runAgain=true;
        do{
            //variables
            String surname ="";
            String month="";
            int date=0;
            String bookingID="";

            //objects
            Scanner keyboard = new Scanner(System.in);
            Hotel myHotel = new Hotel();

            //Inputs
            System.out.println("Please enter your surname: ");
            surname=keyboard.nextLine();
            myHotel.setSurname(surname);

            System.out.println("Please enter the month of your booking: e.g. April");
            month=keyboard.nextLine();
            myHotel.setMonth(month);

            System.out.println("Please enter the date of your booking: e.g. 16");
            date=keyboard.nextInt();
            myHotel.setDate(date);
            
            //Compute
            myHotel.compute();

            //Output
            bookingID=myHotel.getBookingID();
            System.out.println("Here's your booking number: " + bookingID);

            keyboard.nextLine();
            System.out.println("Do you want to search for another booking? Y/N");
            String result = keyboard.nextLine();
            runAgain = result.equalsIgnoreCase("Y");


        } while (runAgain);

            System.out.println("Exiting the application!");

    }
    
}
