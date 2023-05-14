import java.util.*;
public class JFT4Ex2 {
    public static void main(String args[]){
        
        double whiskey = 0.0;
        final double VAT = 0.23;
        double result = 0.0;
        double afterVAT;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the price of the whiskey: ");
        whiskey=keyboard.nextDouble();

        afterVAT = whiskey*VAT;
        result = afterVAT + whiskey;

        System.out.println("The price of the Whiskey after vat is: " + result +" The VAT amout is: "+afterVAT);

        keyboard.close();

    }
    
}
