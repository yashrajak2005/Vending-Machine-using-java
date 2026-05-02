class Car{
        String model ;
        String color ;
        int mileage ;
        int noofgears ;
        Car(String model , String color , int mileage , int noofgears){
            this.model = model ;
            this.color = color ;
            this.mileage = mileage ;
            this.noofgears = noofgears ;
        }


    void applyBrake(){
        System.out.println("Breaking");
    }
    void applySpeed(){
        System.out.println("Applying Speed");
    }
    
    void shiftGear(){
        System.out.println("Shifting Gear");
    }
}
    class Verna extends Car{
        int capacity ;
        Verna(String model , String color , int mileage , int noofgears, int capacity){
            super(model , color , mileage , noofgears);
        }
    }
public class Inheritance {
    public static void main(String[] args){
        Verna v = new Verna("Second Top", "Black",20, 5,4);
        System.out.println(v.model);    
        System.out.println(v.capacity); 
        v.shiftGear();
    }
    
}
