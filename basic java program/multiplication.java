import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=n*i;
            System.out.println("Table is  "+mul);
        }
        
    }

    
}
