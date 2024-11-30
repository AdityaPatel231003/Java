import java.util.Scanner;

public class InputOutput{

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Input(matrix);
        Output(matrix);
        
    }

    public static void Input(int matrix[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();

            }
            System.out.println();
        }
    }

    public static void Output(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}