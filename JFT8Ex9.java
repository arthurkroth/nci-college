/* Write a Java program that creates an array to store the names of the following famous
novels.
 Black Beauty | Treasure Island | Pride and Prejudice
Use an enhanced for loop to display the contents of the array to the console on the same
line. */
public class JFT8Ex9 {
    public static void main(String args[]){
        String novels[];

        novels = new String[3];

        novels[0] = "Black Beauty";
        novels[1] = "Treasure Island";
        novels[2] = "Pride and Prejudice";

        for(String novel : novels){
            System.out.print(novel + " ");
        }

    }
}
