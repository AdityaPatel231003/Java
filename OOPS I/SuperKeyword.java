public class SuperKeyword {
    
    public static void main(String[] args) {
      Horse h=new Horse();
      System.out.println(h.name);
    
    }
    
}
class Animal{
    String name ;
    int rollno;
    static String SchoolName;

            void print(){
                System.out.println("print ");
            }
            Animal(){
                System.out.println("Animal Constructor is called");

            }

}
class Horse extends Animal{
            void eat(){
                System.out.println("eat grass");
            }
                Horse(){
                    super();
                    super.name = "Aditya Patel";
                    System.out.println("Horse COnstructoor is called");
                }
}
