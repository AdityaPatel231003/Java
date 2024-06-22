import java.util.Scanner;

public class binaryTriangle {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Row :");
      int n=sc.nextInt();
      System.out.print("Enter Column :");
      int m=sc.nextInt();
            int one=1;
            int zero=0;
          for(int row=1;row<=n;row++){
              for(int col=1;col<=m;col++){
                  if(row>=col) {
                    if((row+col)%2==0){
                        System.out.print(one+( " "));
                        
                    }
                    else{
                        System.out.print(zero+( " "));
                    }
                     
                  }
                  else{
                      System.out.print(" ");
                  }
                  
              }
              System.out.println();
          }
          }
}
