class A{
    void add(int a, int b) {
        System.out.println("Sum in class A: " + (a + b));
    }
}
class B extends A{
    
    void add(int a, int b) {
        super.add(a, b);
        System.out.println("Sum in class B: " + (a + b));
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
       

        B b = new B();
        b.add(4,5);
    
    }
}
