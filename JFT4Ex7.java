import java.util.*;
public class JFT4Ex7 {
    public static void main(String args[]){
        
        float squareFeet=(float)0.0;
        float squareYards=(float)0.0;
        float costYards=(float)0.0;
        float length=(float)0.0;
        float width=(float)0.0;
        final float PRICE = (float) 37.99;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the lenght of your room: ");
        length= keyboard.nextFloat();

        System.out.println("Enter the width of your room: ");
        width= keyboard.nextFloat();

        keyboard.close();

        squareFeet= length * width;
        squareYards= squareFeet / 9;
        costYards= squareYards + PRICE;

        System.out.println("******************* Carpeting Cost Analysis *******************");

        System.out.println("Square feet: " +squareFeet);
        System.out.println("Square Yards: "+squareYards);
        System.out.println("Cost of carpeting in square yards: " +costYards);

        System.out.println("****************************************************************");
    }
}
