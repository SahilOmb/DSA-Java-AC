
import java.util.Scanner;

public class factorial {
 

    public int factorials(int n){
       int fact = n;
        for (int i = 1; i < n; i++) {
            fact = i * fact;
        }

        return fact;
    }


    public static void main(String[] args) {
        System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     factorial fact = new factorial();
      
         System.out.println("result"+ fact.factorials(n));
    }
}