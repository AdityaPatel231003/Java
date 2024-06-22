import java.util.Scanner;
public class Pall{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Row :");
    int n=sc.nextInt();
    System.out.print("Enter Column :");
    int m=sc.nextInt();
    int row=1;
   
  

    while( row<=n){
        int cu=row;
      for( int col=1;col<=(m+1)/2;col++){
       
          if(row+col>=6){
              
                  System.out.print(cu);
                  cu--;

              
             
          }
          else System.out.print(" ");
      }
      for( int col=1;col<=(m+1)/2;col++){
          if(row>col){
              System.out.print(col+1);

          }
          else System.out.print(" ");
      }
      System.out.println();
      row++;
    }


   
}
}
