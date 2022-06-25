//Run time Polymorphism
class Person
{
    void sleep(){
        System.out.println("Sleeping");
    }
    
    void eat(){
        System.out.println("eating");
    }
    
    void work(){
        System.out.println("Working");
    }
}
class Employee extends Person
{
    @Override
    void eat()
    {
        super.eat();
    }
    @Override
    void work() 
    {
        super.work();
    
    }
}
//random class name
public class Being{
    public static void main(String[] args) 
    {
        Employee obj = new Employee();
        obj.work();
        obj.eat(); 
    }
}

