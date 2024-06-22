import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        boolean isprrime=true;
        if(num==2){
            System.out.println("not a prime");
        }
        else{
        for (int i=2;i<=Math.sqrt(num);i++){

            if(num%i==0){
                isprrime=false;

            }
        }
        if(isprrime==false){
            System.out.println(" not prime");

        }
        else{
            System.out.println(" Prime");
        }
    }
        
    }
}
