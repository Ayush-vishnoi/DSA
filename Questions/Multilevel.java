class Animal{
    void eat()
    {System.out.println("eating...");}      //Animal is parent class
    }
class Dog extends Animal{
    void bark()
    {System.out.println("barking...");}     // Dog is child class
    }
 class BabyDog extends Dog{
    void weep()
    {System.out.println("weeping...");}     // BabyDog is Grand child class
    }
public class Multilevel{
    public static void main(String args[]){
    BabyDog d=new BabyDog();                   // d as Object of BabyDog class
    d.weep();                                  //calling the inherit method
    d.bark();
    d.eat();
    }
}