class privateClass {
    private void display () {
        System.out.println("This is private");
    }
}

class accessingPrivate {
    public static void main(String[] args) {
        privateClass obj = new privateClass();
        obj.display();
    }
}