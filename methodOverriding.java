public class methodOverriding {
    static class Animal {
        void makingSound () {
            System.out.println("Animal making sound");
        }
    }
    static class Dog extends Animal {
        void makingSound () {
            System.out.println("Wof Wof");
        }
    }
    public static void main(String[] args) {
        Dog obj= new Dog();
        obj.makingSound();
    }    
    
}