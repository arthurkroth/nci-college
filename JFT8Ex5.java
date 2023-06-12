/* Create a for loop that counts down the USA Billboard Top 5 music artists of the 1980s!
Store the names of the groups / artists in an array.
Here are the artists and their positions:
No 5: Michael Jackson
No 4: Frankie Goes To Hollywood
No 3: Queen
No 2: Simple Minds
No 1: Rick Astley */
public class JFT8Ex5 {
    public static void main(String args[]){
        String artists[];

        artists= new String[5];

        artists[0] = "No 5: Rick Astley";
        artists[1] = "No 4: Simple Minds";
        artists[2] = "No 3: Queen";
        artists[3] = "No 2: Frankie Goes To Hollywood";
        artists[4] = "No 1: Michael Jackson";

        for(int i=0;i<=5;i++){
            System.out.println(artists[i]);
            
        }
    }
}
