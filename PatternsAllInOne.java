
import java.util.Scanner;

public class PatternsAllInOne {

     public static void StarPattern(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }   System.out.println();
        }
     }
     
     public static void InverseStarPattern(){
         for (int i = 4; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }   System.out.println();
         }
     }

    public static void CharacterPattern(){
        char ch= 'A';
         for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }   System.out.println(); 
                 
    }     
    }
 
    public static void NumericalPattern(){
        int n = 1 ;
         for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }   System.out.println(); 
                 
    }     
    }

    public static void main (String args[]){
            System.out.println("Chooese one: ");
            System.out.println("1)StarPatter 2)InverseStarPattern 3)CharacterPattern 4)NumericalPattern");
            Scanner sc =new Scanner(System.in);
            int Choice = sc.nextInt();
           
            switch (Choice) {
                case 1:
                    StarPattern();
                    break;
                case 2:
                    InverseStarPattern();
                    break;
                case 3:
                    CharacterPattern();
                    break;
                case 4:
                    NumericalPattern();
                    break;
                default:
                    System.out.println("please choose from above bro");
            }
    }
}
