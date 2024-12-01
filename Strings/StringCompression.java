public class StringCompression {
    public static void main(String[] args) {
        String str=new String("aaabbccdde");
        System.out.println(compress(str));    
        }
    public static String compress(String str){
        // O(n) beacause while loop is also having i++
        StringBuilder sb=new StringBuilder("");
            for(int i=0;i<str.length();i++){
                Integer count=1;
                    while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) )
                    {
                    count++;
                    i++;
                    }
                sb.append(str.charAt(i));
                if(count>1){
                    sb.append(count.toString());
                }
            }
        return  sb.toString();
    }
}
