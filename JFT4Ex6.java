import java.util.*;
public class JFT4Ex6 {
    public static void main(String args[]){
        int moneyReceived = 0;

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Please enter the amount of money you want to get from ATM: ");
        moneyReceived=keyboard.nextInt();
        keyboard.close();

        int note20 = moneyReceived/20;
        moneyReceived = moneyReceived % 20;
        int note10 = moneyReceived/10;
        moneyReceived = moneyReceived % 10;
        int note5= moneyReceived/5;
        moneyReceived = moneyReceived % 5;
        int coin1= moneyReceived / 1;
        moneyReceived = moneyReceived % 1;

        System.out.println("******************* Coin Machine *******************");
        System.out.println("Som of the money is " + moneyReceived + " euros.");
        System.out.println("No of 20's: "+ note20);
        System.out.println("No of 10's: "+ note10);
        System.out.println("No of 5's: "+ note5);
        System.out.println("No of 1's: "+ coin1);


        System.out.println("****************************************************");
    }
}
