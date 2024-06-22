import java.util.*;
public class FloydTriangle {
        public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Row :");
      int n=sc.nextInt();
      System.out.print("Enter Column :");
      int m=sc.nextInt();
            int counter=1;
          for(int row=1;row<=n;row++){
              for(int col=1;col<=m;col++){
                  if(row>=col) {
                      System.out.print(counter+( " "));
                      counter++;
                  }
                  else{
                      System.out.print(" ");
                  }
                  
              }
              System.out.println();
          }
          }
}
