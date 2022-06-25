//Abstract class with method overloading
abstract class Vehicle{
    abstract void run();
    abstract void stop();

    int speed;
    long distance;

    void Vechile(){
        System.out.println("I am in the Parent class");
    }
    Vehicle(int speed, long distance){
        this.speed= speed;
        this.distance= distance;
    } 

    public void fuel(int a){
        System.out.println("inside int method");
    }
    public void fuel(float b, String name){
        System.out.println("inside method");
    }
    public void fuel(char c, int a1){
        System.out.println("inside char,int method");
    }   
}
class TwoW extends Vehicle{
    int speed = 200;
    long distance = 10;
    int no_of_tyres = 2;

    TwoW() {
        super(300, 600);
        System.out.println("Cons called");
    }

    @Override
    public void run(){
        System.out.println("I am in run method");
    }
    @Override
    public void stop(){
        System.out.println("I am in stop method");
    }
    
    void display(){
        System.out.println(this.speed);
        System.out.println(this.distance);
        System.out.println(this.no_of_tyres);
        System.out.println(super.speed);
        System.out.println(super.distance);
    }
}
class ThreeW extends Vehicle{
    int speed = 100;
    long distance = 20;
    int no_of_tyres = 3;

    ThreeW() {
        super(300, 600);
        System.out.println("Cons called");
    }

    @Override
    public void run(){
        System.out.println("I am in run method");
    }
    @Override
    public void stop(){
        System.out.println("I am in stop method");
    }
    
    void display(){
        System.out.println(this.speed);
        System.out.println(this.distance);
        System.out.println(this.no_of_tyres);
        System.out.println(super.speed);
        System.out.println(super.distance);
    }
}
class FourW extends Vehicle{
    int speed = 80;
    long distance = 30;
    int no_of_tyres = 4;

    FourW() {
        super(300, 600);
        System.out.println("Cons called");
    }

    @Override
    public void run(){
        System.out.println("I am in run method");
    }
    @Override
    public void stop(){
        System.out.println("I am in stop method");
    }
    
    void display(){
        System.out.println(this.speed);
        System.out.println(this.distance);
        System.out.println(this.no_of_tyres);
        System.out.println(super.speed);
        System.out.println(super.distance);
    }
}
class EightW extends Vehicle{
    int speed = 60;
    long distance = 200;
    int no_of_tyres = 8;

    EightW() {
        super(300, 600);
        System.out.println("Cons called");
    }

    @Override
    public void run(){
        System.out.println("I am in run method");
    }
    @Override
    public void stop(){
        System.out.println("I am in stop method");
    }
    
    void display(){
        System.out.println(this.speed);
        System.out.println(this.distance);
        System.out.println(this.no_of_tyres);
        System.out.println(super.speed);
        System.out.println(super.distance);
    }
}
public class MainVehicle{
    public static void main(String[] args) {
        TwoW w = new TwoW();
        w.display();
        w.fuel(20);
        w.fuel(1000f,"Bajaj");
        w.fuel('B', 2);
        System.out.println("__________***********___________");
        ThreeW a = new ThreeW();
        a.display();
        a.fuel(300);
        a.fuel(200f,"Auto");
        a.fuel('R', 3);
        System.out.println("__________***********___________");
        FourW f = new FourW();
        f.display();
        f.fuel(60);
        f.fuel(20f,"Hundai");
        f.fuel('R', 4);
        System.out.println("__________***********___________");
        EightW e = new EightW();
        e.display();
        e.fuel(300);
        e.fuel(200f,"Truck");
        e.fuel('T', 5);
        System.out.println("__________***********___________");
    }
}
    

