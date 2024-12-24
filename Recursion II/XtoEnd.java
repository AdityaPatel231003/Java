public class XtoEnd {
    public static void main(String[] args) {
        String str="acdyhgiyv";
        End(str,0,'y',0,"");
    }
    public static void End(String str , int i,char element,int count,String newstr){

        if(i==str.length()){
            for(int C=0;C<count;C++){
                newstr=newstr+element;
            }
            System.out.print(newstr);
            return;
        }
        char ch=str.charAt(i);
            if(ch==element){
                    End(str, i+1, element, count+1,newstr);
            }else{
                End(str, i+1, element, count,newstr+ch);
            }
            
    }
}
