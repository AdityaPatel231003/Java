import java.util.*;
public  class Average{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        
        
        int a =sc.nextInt();
        int b= sc.nextInt();
        float c=sc.nextFloat();
        float d=(a+b+c)/3;
        System.out.println("Average of Three Number :"+d);
        char ch=(char)d;
        System.out.println(ch);
    }

}