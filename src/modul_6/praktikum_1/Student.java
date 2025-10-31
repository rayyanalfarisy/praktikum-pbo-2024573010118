package modul_6.praktikum_1;

public class Student extends Person{
    private String StudentId;

    public Student(String name,int age,String studentId){
        super(name,age);
        this.StudentId=studentId;
    }
    public void study(){
        System.out.println(name + "is studying");
    }

    @Override
    public void greet(){
        System.out.println("hello,i am a student named" + name);
    }
}
