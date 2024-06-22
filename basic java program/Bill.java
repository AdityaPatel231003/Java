import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float GST=(a+b+c)/100;
        float d=(a+b+c)+(GST*18);
        System.out.println("Bill including 18% GST :"+d);
    }
    
}
