public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1010;
        
        int decimal = 0;
        int pow = 1;
        while (binary > 0) { 
            int last_digit = binary % 10 ;
            decimal = decimal + (last_digit * pow);
            pow = pow *2;
            binary = binary / 10;
        } System.out.println("decnimal number is " + decimal);

    }
}
