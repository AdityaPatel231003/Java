public class hollowRectangle {
    
    public static void main(String[] args) {
        
        int n=4;
        int m=5;
        
        int current=1;
        while(current<=n){
          
            for(int i=1;i<=m;i++){
                if(current==1||current==n||i==1||i==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            current++;
        }
    }
}
