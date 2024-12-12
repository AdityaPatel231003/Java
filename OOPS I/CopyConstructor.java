public class CopyConstructor {
    public static void main(String[] args) {
        Student std1=new Student();
        std1.name="Aditya";
        std1.rollno=8;
        Student std2=new Student(std1);
        std2.password="xyz";

System.out.println(std1.rollno);
System.out.println(std1.name);
System.out.println(std1.password);
System.out.println(std2.password);
System.out.println(std2.rollno);
System.out.println(std2.name);

    }
    
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    Student(){

    }
    Student(Student std1){
        this.name=std1.name;
        this.rollno=std1.rollno;
        

    }

}
