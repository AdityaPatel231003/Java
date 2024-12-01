import java.util.Scanner;

public class PrintLetterOfStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        print(str);
        System.out.println(str);
        // String is call by value
    }
    public static String print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) +" ");
        }
        return str;
    }
}
