public class CallByValue {
    static void add(int a, double b){
        double c = a+b;
        System.out.println(c);
       
    }
    public static void main(String[] args){
        int a = 10;
        double b = 20.0;
        add(a,b);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
