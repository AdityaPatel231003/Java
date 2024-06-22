public class SolidRhombus {
    public static void main(String[] args) {
        int n=5;
        int  m=9;
        for(int row=1;row<=n;row++){
            for( int col=1;col<=m;col++){
                if ((row+col>=6)&&(row+col<=10)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}
