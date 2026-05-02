import java.util.*;
public class Fibbonaci {
    public static int fibonacci(int n){
        for(int i=0; i<=n; i++)
        if(n==0 || n==1){
            return n;
        }
        int fibon = fibonacci(n-1)+fibonacci(n-2);
        return fibon;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}