public class StringCompression {

    private static String Compression(String str) {

        StringBuilder newstr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            } 
             if (count > 1) {
                newstr.append(count);
            }
            newstr.append(str.charAt(i));
            
           
        }
        
        return newstr.toString();
    }

    public static void main(String[] args) {
        String str = "aabbccccc";
        System.out.println(Compression(str));
    }
}
