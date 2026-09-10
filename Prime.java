public class Prime {
    public static void main(String[] args) {
        int n = 17;
       System.out.println( "The number is "+IsPrime(n));
       PrimeInRange(n);
        }  

        public static void PrimeInRange(int n){
            for (int i = 1; i <= n; i++) {
                if(IsPrime(i)){
                System.out.println(i +"");
            }}
        }
    

 public static boolean IsPrime(int n){
     boolean prime = true;
       if(n <= 1 ){
        prime = false;
       }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
               prime = false ;
            } 
 }    return prime;}

}