public class JFT4Ex5 {
    public static void main(String args[]){
        double investiment = 1000;
        final double INTEREST_RATE = 0.05;
        double totalValue = 0.0;
        double totalInterest= 0.0;

        totalInterest = investiment * INTEREST_RATE;
        totalValue= (investiment * INTEREST_RATE) + investiment;

        System.out.println("The principal is: " +investiment);
        System.out.println("The rate of interest is: " +INTEREST_RATE);
        System.out.println("The interest earned is: " +totalInterest);
        System.out.println("The total amount is: " +totalValue);
    }
}
