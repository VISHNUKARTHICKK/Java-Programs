interface Animal {
void sound();
    
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bow Bow...");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Meow Meow...");
    }
}
class Cow implements Animal{
    public void sound(){
        System.out.println("Moo Moo...");
    }
}
class Simulation{
    void animalSound(Animal a){
        a.sound();
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();    
        Cow w=new Cow();
        Simulation s=new Simulation();
        s.animalSound(d);
        s.animalSound(c);
        s.animalSound(w);
    }
}