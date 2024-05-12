class adding {
    static int sum (int a,int b) {
        return a+b;
    }
    static int sum (int a,int b,int c) {
        return a+b+c;
    }
}
public class methodOverloading {
    public static void main (String[] args) {
        System.out.println(adding.sum(10,4));
        System.out.println(adding.sum(10,69,45));
    }
}