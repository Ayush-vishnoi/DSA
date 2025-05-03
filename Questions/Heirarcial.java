package Questions;
class Animal{
    void eat()
    {System.out.println("eating...");   }           // animal is superclass
    }
class Dog extends Animal{
    void bark()
    {System.out.println("barking...");}             // dog is subclass
    }
class Cat extends Animal{
    void meow()
    {System.out.println("meowing...");}             //cat is subclass
    }
public class Heirarcial{
 
    public static void main(String args[]){
    Cat c=new Cat();
    c.meow();
    c.eat();
    Dog d=new Dog();
    d.bark();
    }
}