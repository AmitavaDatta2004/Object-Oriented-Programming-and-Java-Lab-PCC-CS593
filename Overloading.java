class Overloading {

    public static void main(String[] args) {

        System.out.println("1");
        Overloading t = new Overloading();
        t.main(new String[]{"Hello", "World"});
        // t.main(20);
    }

    public static void main() {

        System.out.println("2");

    }
}