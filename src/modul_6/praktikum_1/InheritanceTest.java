package modul_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[]args){
        Student Student=new Student("alice",20,"S12345");

        //Memanggil method dari superclass
        Student.displayInfo();

        //Memanggil method dari superclass
        Student.study();

        //Memanggil method dari superclass
        Student.greet();

        //polymorphise student sebagai person
        Person person = new Student("bob",22,"S67890");
        person.greet();
    }
}
