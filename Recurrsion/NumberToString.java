public class NumberToString {
    public static void main(String[] args) {
        int n=20190;
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        myfun(n,str);
    }
    public static void myfun(int n,String str[]){
        
        if(n<=0){
            return ;
        }
        int ld=n%10;
        n=n/10;
        myfun(n, str);
        System.out.print(str[ld]+" ");
       
       

    }
}
