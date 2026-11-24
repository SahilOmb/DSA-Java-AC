public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calsi = new Calculator();
         System.out.println(calsi.sum(30, 30));          // Output: 70  (10 + 30 + 30)
        System.out.println(calsi.sum(34.5f, 67.89f));   // Output: 112.39 (10 + 34.5 + 67.89)
        System.out.println(calsi.sum(45, 54, 78));      // Output: 187 (10 + 45 + 54 + 78)
       Calculator AdvCalsi = new AdvanceCalsi(100);
       System.out.println(AdvCalsi.sum(45,98));

    }
}

class Calculator{
    
    int sum(int a,int b){
     return  a + b;
    }
    float sum(float a ,float b){
    return a + b;
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }
}

class AdvanceCalsi extends Calculator{
    int basevalue;
    public AdvanceCalsi(int baseVal){
        this.basevalue=baseVal;
    }

    @Override 
    int sum(int a, int b){
        return basevalue * (a-b)/(a+b);
    }
}