import java.util.*;
public class posittive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        
        if(a==0)
        {
            System.out.println("number is neither positive nor negative");
        }
        else if( a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("positive");
        }
    }
    
}
