import java.util.Scanner;

public class NumberPyramid {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Row :");
    int n=sc.nextInt();
    System.out.print("Enter Column :");
    int m=sc.nextInt();
    

    
    for(int row=1;row<=n;row++){
        for(int col=1;col<=m;col++){
            if(row+col>=n+1) {
                System.out.print(row + " ");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
           
          
          }
}
