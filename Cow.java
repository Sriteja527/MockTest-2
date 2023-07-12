import java.util.*;
 class Animal{
    void makeSound(){
        System.out.println("shhhh");
    }
}
class Dog extends Animal{
public void makeSound(){
    System.out.println("Boww");
}
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
public class Cow extends Animal{
    public void makeSound(){
        System.out.println("Amba");
    }
public static void main(String[] args){
    Animal a = new Animal();
    a.makeSound();
    Dog d = new Dog();
    d.makeSound();
    Cat c = new Cat();
    c.makeSound();
    Cow c1 = new Cow();
    c1.makeSound();
}
}
