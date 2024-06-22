import java.util.*;

public class continous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number");
            int a=sc.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println(a);
        }while(true);
        
    }
}
