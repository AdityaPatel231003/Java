public class Butterfly {
    public static void main(String[] args) {
        int n=8;
        int m=8;
        for(int row=1;row<=8;row++){
            for(int col=1;col<=m;col++){

                if( (row>=col)&&(row+col)<=9){
                    System.out.print("*");
    
                }
             
                
                else if( (row<=col)&&(row+col)>=9){
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
}
