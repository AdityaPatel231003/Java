public class PrintBinary {
    public static void main(String[] args) {
        int n=3;
        Binary(n,new String(""),0);
    }
    public static void Binary(int n,String str,int ld){
        
        if(n==0){
            System.out.println(str);
            return;
        }

        if(ld==0){
            Binary(n-1, str+"0",0);
            Binary(n-1, str+"1",1);
        }
        else{
            Binary(n-1, str+"0",0);
        }
    }
}
