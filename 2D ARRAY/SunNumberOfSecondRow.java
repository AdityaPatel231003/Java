public class SunNumberOfSecondRow {
    public static void main(String[] args) {
        int matrix[][]={{1,8,3,4},{5,7,7,8}};
      
        int sum=0;
        for(int i=0;i<matrix.length;i++){
           sum+=matrix[1][i];
        }
        System.out.println(sum);
    }
    
}
