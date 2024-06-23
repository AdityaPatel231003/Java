public class inverted{
    public static void main(String[] args){
        int n=5;
        int spaces=n-1;
        int star=1;
        int current=1;

        while(current<=n){
            // spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }
            System.out.println(" ");
            
            star++;
            spaces--;
            current++;
        }
    }
}