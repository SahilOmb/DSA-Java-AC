import java.util.Scanner;

public class StringsInJava {

   public static void printletters(String str){
    for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i));
    }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        name= sc.nextLine();
        String likes = "loves fried chicken momos";
        printletters(likes);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("output : "+name);
        System.out.println(name.length());
        System.out.println(name+" "+likes);
        System.out.println(name.charAt(2));
        System.out.println(name.substring(0, 3));
    }
}
