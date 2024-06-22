import java.util.Scanner;

public class sum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int sum_even=0;
    int sum_odd=0;
    while(n>0){
        int ld=n%10;
        if(ld%2==0){
             sum_even+=ld;
            
            
        }
        else{
            sum_odd+=ld;
            
            
        }
        n/=10;
    }
    System.out.println("Sum of even number" + sum_even);
    System.out.println("Sum of odd number" + sum_odd);
   } 
}
