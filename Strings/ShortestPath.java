public class ShortestPath {
    public static void main(String[] args) {
        String str=new String("WNEENESENNN");
        System.out.println(path(str));
        
    }
    public static float path(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir=(Character.toUpperCase(str.charAt(i)));
        
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        x=x-0;
        y=y-0;
        int X_Square=x*x;
        int y_Square=y*y;
        float shortpath=(float)Math.sqrt(X_Square + y_Square);
        return shortpath;
    }
    
}
