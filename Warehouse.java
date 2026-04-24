import java.util.*;
public class Warehouse {
    public static void main(String[] args){
        System.out.println("Enter the number of product in warehouse : ");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int currentStock,minimumStock;
        for(int i = 1; i <= N; i++){
            System.out.println("Enter the current stock pf "+i);
            currentStock = sc.nextInt();
            System.out.println("Enter the minimum stock of "+i);
            minimumStock = sc.nextInt();
            if(currentStock < minimumStock){
                System.out.println("Product "+i+" is needed to be restocked");
                count++;
            }
            else{
                System.out.println("Product "+i+" is well stocked");
            }

        }
        System.out.println("Total number of products that need to be restocked: "+count);
        sc.close();
    }
    
}
