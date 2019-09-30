package ifelse1;
import java.util.Scanner;

public class Ifelse1 {

    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int x,y,z;
       System.out.println("What is x?");
       x = in.nextInt();
       System.out.println("What is y?");
       y = in.nextInt();
       System.out.println("What is z?");
       z = in.nextInt();
       
       if(x>=y && x>=z){
           System.out.println("X yang paling besar");
       }
       else if(y>=z && y>=x){
           System.out.println("Y yang paling besar");
       }
       else {
           System.out.println("Z yang paling besar");
       }
    }
}
