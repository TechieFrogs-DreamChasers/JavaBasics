//Handle ClassCastException
public class Program19 extends Person{
    String name;
    public Program19(String person_Name) {
        super(person_Name);
        name=person_Name;
    }
    void display(){
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        Program19 pgm=new Program19("Meghan");
        Person person=new Person("Adam");
        person=pgm;
        person.display();
        try{
        Person person2=new Person("Annie");
        Program19 program19=(Program19)person2;
        } catch (Exception e) {
            System.out.println(e.initCause(e.getCause()));
        }
    }
}
class Person{
   String person_Name;

    public Person(String person_Name) {
        this.person_Name = person_Name;
    }

    void display(){
       System.out.println("Person Name: "+person_Name);
   }
}
/*
Name: Meghan
java.lang.ClassCastException:
class Person cannot be cast to class Program19 (Person and Program19 are in unnamed module of
loader 'app')
*/
