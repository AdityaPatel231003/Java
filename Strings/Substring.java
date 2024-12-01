public class Substring {
    public static void main(String[] args) {
     String str="HelloWorld";
    System.out.println(sub(str,0,5));
    System.out.println(Inbuilt(str,0,5));
    System.out.print(StrBui(str,0,5));
    }
    public static String sub(String str,int si,int ei){
        String newstr="";
        for(int i=si;i<ei;i++){
            newstr+=str.charAt(i);
        }
        return newstr;
    }
    public static String Inbuilt(String str,int si,int ei){ 
        return  str.substring(si, ei);
    }

         public static String StrBui(String Str,int si,int ei){
         StringBuilder sb=new StringBuilder("");
         for(int i=si;i<ei;i++){
             sb.append(Str.charAt(i));
         }
        
 
         return sb.toString();
        }
     
    
}
