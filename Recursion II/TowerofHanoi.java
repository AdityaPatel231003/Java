public class TowerofHanoi {
    public static void main(String[] args) {
        int n=3;
      
        TOH(n,"A","B","C");

    }
    static int total=3;
    public static void TOH(int n , String Src,String Help,String dest ){
        
            if(n==0){
                return;
            }

        TOH(n-1,Src,dest,Help);
        System.out.println("transfer disk " +(total-n+1)+ " from " +Src + "  " + dest);
        TOH(n-1, Help, Src, dest);
    }
}
