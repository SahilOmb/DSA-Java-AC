public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 7;
        int binary = 0;
        int pow = 1;

        while(decimal > 0){
            int remainder = decimal % 2;
            binary = binary + (remainder* pow);
            pow = pow *10;
            decimal = decimal / 2;
        } System.out.println("binary number is :" + binary);
    }
}
