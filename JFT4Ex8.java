public class JFT4Ex8{
    public static void main(String args[]){
    int c = 3;
    c++;
   
    System.out.println("The value of c is " + c); // 4
    int w = 0;
    w = ++c;
    System.out.println("The value of w is " + w); // 5
    System.out.println("The value of c is " + c); // 5
    int x = 0;
    x = c++;
    System.out.println("The value of x is " + x); //5
    System.out.println("The value of c is " + c); //6
    int y = 0;
    y = --c;
   
    System.out.println("The value of y is " + y); //5
    System.out.println("The value of c is " + c); //5
   
    int z = 10;
    z++;
    ++z;
    --z;
    int qq = ++z; //12
    z = c--; // 12 and 4
   
    System.out.println("The value of z is " + z); // 5
    System.out.println("The value of c is " + c); // 4
    System.out.println("The value of qq is " + qq); // 12

    System.out.println((10+6)*3-6/2);
   
    }//method
   }//class