/* Imagine that a fishing trip will only go ahead if there are seven positive responses.
Create an array to store the following character values (the data type of the array should be
char, and the size / length of the array, 10).
Y
Y
Y
Y
Y
Y
N
N
Y
N
Determine if the fishing trip will go ahead. Make use of the break keyword in your solution.  */
public class JFT8Ex11 {
    public static void main(String args[]){
        char responses[] = {'Y','Y','Y','Y','Y','Y','N','N','N','Y'};

        int positiveCount = 0;
        boolean pass = false;

        for(char response : responses){
            if(response == 'Y'){
                positiveCount = positiveCount + 1;
                if(positiveCount >= 7){
                    pass = true;
                    break;
                }
            }
        }
        if(pass){
            System.out.println("The fishing trip is going ahead!");
        } else {
            System.out.println("Not enough positive votes!");
        }
    }
}
