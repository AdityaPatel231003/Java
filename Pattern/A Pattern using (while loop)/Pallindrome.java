public class Pallindrome {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int spaces=n-1;
        int current=1;
        int total=2*n;
        while(current<=n){
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            int num=1;
            for(int i=1;i<=star;i++){
                System.out.print(num);
             if (i<=star/2){
                num++;
             }
             else{
                num--;
             }
            
             
            }

            System.out.println();
            spaces--;
            star+=2;
            current++;
        }
    }
}
