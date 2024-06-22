public class reverse {
    public static void main(String[] args) {
        int num=10899;
   int rv = 0;
    while(num>0){
        int ld=num%10;
        rv=(rv*10)+ld;
        num/=10;

    }
    System.out.println(rv);
        
    }
    
    
}
