/* Write a Java program that stores user passwords in an array. The passwords are shown
below.
oxymoran
poxedfox
kingfisher
cruiseshipper
Create a variable to store the name of a user’s password. Assign it the value, cruiseshipper.
Using an enhanced for loop, search the array for the password. If the password is found,
display the message, “Log-On Successful”. Use the break keyword to leave the looping
construct early, if so.
After searching the array, if the password is not found, display a single error message to the
user. “You cannot be logged on using the specified password.” */
public class JFT8Ex10 {
    public static void main(String args[]){

        String passwords[];
        passwords = new String[4];

        boolean found = false;

        passwords[0] = "oxymoran";
        passwords[1] = "poxedfox";
        passwords[2] = "kingfisher";
        passwords[3] = "cruiseshipper";

        String userPassword = "cruiseshipper";

        for(String password : passwords){
            if (password.equals(userPassword)){
                found = true;
                break;
            } 
        }
        if(found){
            System.out.println("Log-On Successful");
        } else {
            System.out.println("You cannot be logged on using the specified password.");
        }

        

    }
}
