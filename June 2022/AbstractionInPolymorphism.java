abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("WOF WOF !!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound () {
        System.out.println("MEOW");
    }
}
public class AbstractionInPolymorphism {
    public static void main(String[] args) {
        Animal [] animals = {new Dog(), new Cat()};
        for(Animal animal:animals) {
            animal.makeSound();
        }
    }
}