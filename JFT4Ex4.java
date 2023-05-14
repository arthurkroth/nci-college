public class JFT4Ex4 {
    public static void main(String args[]){
        int workedMinutes = 199;
        int workedHours =workedMinutes / 60;
        int remainderMinutes= workedMinutes % 60;

        System.out.println("You have worked "+workedMinutes + " minutes, which is " + workedHours + " hours and "+ remainderMinutes + " minutes");

    }
    
}
