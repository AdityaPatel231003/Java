public class Pascal {
    public static int factorial(int n){
        int fact=1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
       
 int n=7;
 int row=0;
 int spaces=n-1;
 int star=0;
 int current=1;
 while(current<=n){
    for(int i=1;i<=spaces;i++){
        System.out.print(" ");
    }
    for(int i=0;i<=star;i++){
        int nn=factorial(row);
        int r=factorial(i);
        int nn_r=factorial( row-i);
        int ans=nn/(r*nn_r);
        System.out.print(ans +" ");
        
    }
    System.out.println(" ");
    spaces--;
    star++;
    current++;
    
    row++;
 }
    
    }
}
