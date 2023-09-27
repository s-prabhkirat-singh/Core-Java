abstract class Person{
    abstract void eat();
    void run(){
        System.out.println("a person is running");
    }
}
class veg extends Person{

    void eat(){
        System.out.println("veg food");
    }
}

public class absttractclss {
    public static void main(String[] args) {
        // Person x= new Person() ;
// abstract class cannot be instansiated i.e. we cannot crreate the object of an abstract class.{as because the abstract method has no body

      
        Person person = new veg();
        person.eat();
    
    
    }
}
