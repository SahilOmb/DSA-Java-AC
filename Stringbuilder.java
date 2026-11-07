public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch='a'; ch <='z';ch++){
          sb.append(Character.toUpperCase(ch));
        
        }System.out.println(sb);
    }
}




