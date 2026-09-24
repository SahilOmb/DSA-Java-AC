public class InvertedRotatedHalfPyramid {

   public static void method1(int n){
       for (int i = 0; i <= n; i++) {
           for (int j = 0; j <= n - i; j++) {
               System.out.print(" ");
           }
            for (int j = 0; j <= i; j++) {
               System.out.print("*");
           }
        System.out.println();
       }
   }

   public static void method2(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if(j<=n-i){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        } System.out.println();
    }
   }



    public static void main(String[] args) {
        method1(5);
    }
}
