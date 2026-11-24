import PackageDemoCalsi.PackageDemoCalculator; 

public class PackageDemo {
    public static void main(String[] args) {
        PackageDemoCalculator calsi = new PackageDemoCalculator(10);

        System.out.println("Power (2^3 + 10): " + calsi.power(2, 3));          
        System.out.println("Square (5^2 + 10): " + calsi.power(5));           
        System.out.println("Square Root (√144 + 10): " + calsi.squareRoot(144));
        System.out.println("Log10 (log10(100) + 10): " + calsi.log10(100));    
        System.out.println("Sin(30°) + 10: " + calsi.sinDegrees(30));         
        System.out.println("Modulus (17 % 5 + 10): " + calsi.modulus(17, 5)); 
        System.out.println("Factorial (5! + 10): " + calsi.factorial(5));     
    }
}
