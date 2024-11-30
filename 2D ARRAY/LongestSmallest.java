import java.util.Scanner;

public class LongestSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][4];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
        System.out.println();

        longest(matrix);
        Smallest(matrix);
    }
    public static void longest(int matrix[][]){
        int longest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            longest=Math.max(longest,matrix[i][j]);
            }
        }
        System.out.println(longest);
    }
    public static void Smallest(int matrix[][]){
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
           if(matrix[i][j]<Smallest){
            Smallest=matrix[i][j];
           }
        }
    }
    System.out.println(Smallest);
    
}
}
