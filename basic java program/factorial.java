import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        int fact=1;
        for(int i=a;i>0;i--){
            fact*=i;

        }
        System.out.println("Factorial of "+fact);
    }
}
