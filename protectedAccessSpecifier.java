class protectedAccessSpecifier  {
    protected void method () {
        System.out.println("I am protected....hehehe");
    }
}

class subClass extends protectedAccessSpecifier {
    public static void main(String[] args) {
        protectedAccessSpecifier obj=new protectedAccessSpecifier();
        obj.method();
    }
}
