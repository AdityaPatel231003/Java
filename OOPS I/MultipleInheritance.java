public class MultipleInheritance {
    
    public static void main(String[] args) {
        Dear object=new Dear();
       object.eatA();
        object.eatP();
    }
}
interface Herbivore{
    void eatP();
}
interface Carnivore{
    void eatA();
}

class Dear implements Herbivore,Carnivore{
   public void eatP(){
    System.out.println("Eat Plant based food");

    }
    public void eatA(){
        System.out.println("Eat animal based foodd");
    
        }

}