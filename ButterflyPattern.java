public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        //phase 1
        for (int i = 1; i <= n; i++) {
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }  
            // space - 2*(n-i)
            for (int k = 1; k <=2*(n-i); k++) {
                System.out.print(" ");
            }
             //stars - i
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        //phase 2
          for (int i = n; i>= 1; i--) {
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }  
            // space - 2*(n-i)
            for (int k = 1; k <=2*(n-i); k++) {
                System.out.print(" ");
            }
             //stars - i
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
