public class methodOverriding {
    static public class cat {
        void makeSound () {
            System.out.println("Meow !!! ");
        }
    }
    static public class dog extends cat {
        void makeSound () {
            System.out.println("WOF WOF !!!");
        }
    }
    public static void main (String[] args) {
        dog D=new dog();
        D.makeSound();
    }
}