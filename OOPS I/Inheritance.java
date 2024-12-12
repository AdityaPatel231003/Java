public class Inheritance {
    public static void main(String[] args) {
        // fish shark=new fish();
        // shark.eat();
        // shark.swim();
        // shark.color="blue";
        // System.out.println(shark.color);

        Dolphin dp=new Dolphin();
        dp.swim();
        dp.Color="light blue";
        System.out.println(dp.Color);
        dp.eat();
       dp.size(23);

        
    }
    
}
// single Inheritance
class Animal{
    String color;
    
    void  eat(){
        System.out.println("Animal eat food");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("fish swim");
    }
}
// Mutilevel Inheritance
class Dolphin extends fish{
    String Color;
    void  size(int siz){
        System.out.println("long");

    }
    
}
