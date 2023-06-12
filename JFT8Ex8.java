/* Write a Java program that uses an array to store the names of the following colours.
 Blue | Orange | Yellow | Green | White | Red | Black
Use an enhanced for loop, to display the contents of the array on separate lines in the
console.
 */
public class JFT8Ex8 {
    public static void main(String args[]){
        String colors[];

        colors= new String[7];

        colors[0] = "Blue";
        colors[1] = "Orange";
        colors[2] = "Yellow";
        colors[3] = "Green";
        colors[4] = "White";
        colors[5] = "Red";
        colors[6] = "Black";

        for(String color : colors ){
            System.out.println(color);
        }
    }
    
}
