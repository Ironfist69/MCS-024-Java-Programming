class Adding {
    static int add (int a,int b) {
        return a+b;
    }
    static int add (int a,int b,int c) {
        return a+b+c;
    }
}

public class methodOverloading {
    public static void main (String [] args) {
        System.out.println(Adding.add(10,23));
        System.out.println(Adding.add(1,69,30));
    }
}
