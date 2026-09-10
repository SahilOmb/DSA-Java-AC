public class BinomialCoeff {


     public static int Factorial(int n){
        int fact = n;
        for (int i = 1; i < n; i++) {
            fact = i * fact ;
        }
        return fact;
     }
      public static int BinomialCoefficient(int n , int r){
        int totnum = Factorial(n);
        int selectedNum = Factorial(r);
        int MinusNum = Factorial(n - r);

        int BinomialCoeff = totnum / (selectedNum *MinusNum);
        return BinomialCoeff;
      }


    public static void main(String[] args) {
        System.out.println("Binomial is :" + BinomialCoefficient(6, 2));
    }
}
