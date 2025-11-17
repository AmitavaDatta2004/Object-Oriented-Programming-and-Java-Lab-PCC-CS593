public class Test {
    int a;
    int b;
    Test(int a) {
        this.a = a;
        System.out.println("Constructor called");
    }

    Test(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor with two parameters called: " + a + ", " + b);
    }
    // Test(int a) {
    //     this.a = a;
    //     System.out.println("Constructor with parameter called: " + a);
    // }
    public static void main(String[] args) {
        Test obj1 = new Test(5);
        Test obj2 = new Test(10, 20);
        Test obj3 = new Test();
    }
}
