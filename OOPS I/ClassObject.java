public class ClassObject{
    public static  void main(String[] args) {
        Animal anm =new Animal();
        anm.height=23;
        System.out.println(anm.height);
        anm.setcolor("black");
        System.out.println(anm.Color);
        
    }

}
class Animal{
    String Color;
    int height;
     void setcolor(String Colour){
       Color=Colour;
     }
    
    
}