package PackageDemoCalsi;

public class PackageDemoCalculator {
    protected int baseValue;

    public PackageDemoCalculator(int baseValue) {
        this.baseValue = baseValue;
    }

    // --- Overloaded Methods (Compile-Time Polymorphism) ---
    
    // Power: base^exponent + baseValue
    public double power(double base, double exponent) {
        return baseValue + Math.pow(base, exponent);
    }

    // Overloaded Power: squares a single number + baseValue
    public double power(double base) {
        return baseValue + Math.pow(base, 2);
    }

    // --- Advanced Arithmetic Methods ---

    // Square root + baseValue
    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return baseValue + Math.sqrt(num);
    }

    // Base-10 Logarithm + baseValue
    public double log10(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Logarithm input must be greater than zero.");
        }
        return baseValue + Math.log10(num);
    }

    // Sine of an angle in degrees + baseValue
    public double sinDegrees(double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees);
        return baseValue + Math.sin(radians);
    }

    // Modulus (Remainder) + baseValue
    public int modulus(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return baseValue + (dividend % divisor);
    }

    // Factorial (n!) + baseValue
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return baseValue + fact;
    }
}