public class ConverttoUppercase {

    public static void ToUpperCase(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
               sb.append(Character.toUpperCase(str.charAt(i+1)));
            }else{
                sb.append(str.charAt(i+1));
            }
        }System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "i like rashmika mandanna ";
           ToUpperCase(str);
    }
}
