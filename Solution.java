import java.util.*;
class TravelAgency {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;
    TravelAgency(int regNo, String agencyName, String packageType, int price, boolean flightFacility ){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    public int getRegNo() {
        return regNo;
    }
    public void setRegno(int regNo){
        this.regNo=regNo;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public void setAgencyName(String agencyName){
       this.agencyName=agencyName;
    }
    public String getPackageType() {
        return packageType;
    }
    public void setPackageType(String packageType){
       this.packageType=packageType;
    }
    public int getPrice() {
        return price;
    }
    public void setprice(int price){
       this.price=price;
    }
    public boolean getFlightFacility() {
        return flightFacility;
    }
    public void setFlightFacility(boolean flightFacility){
         this.flightFacility=flightFacility;
     }
    


}
public class Solution {
    static int agencyWithHighestPrice(TravelAgency[] arr){
        int maxPrice = 0;
        for(TravelAgency travelAgency : arr){
            if(travelAgency.getPrice() > maxPrice){
                maxPrice = travelAgency.getPrice();
            }
        }
        return maxPrice;
    }

    static TravelAgency agencyDetailsForGivenIdAndType(TravelAgency[] arr, int regNo, String packageType){
        for(TravelAgency travelAgency : arr){
            if(travelAgency.getFlightFacility()  && travelAgency.getRegNo()==regNo && travelAgency.getPackageType().equalsIgnoreCase(packageType)){
               return travelAgency;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        TravelAgency[] arr = new TravelAgency[n];
        for(int i=0;i<n;i++){
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean flightFacility = sc.nextBoolean();

            TravelAgency  t =  new TravelAgency(regNo, agencyName, packageType, price, flightFacility);
            arr[i] = t; 
        }
        int regNo = sc.nextInt();
        sc.nextLine();
        String packageType = sc.nextLine();
        System.out.println("------------------\nOutput\n----------------------        ");
        int highestPrice = agencyWithHighestPrice(arr);
        TravelAgency agency = agencyDetailsForGivenIdAndType(arr, regNo, packageType);
        System.out.println(highestPrice);
        if(agency!=null){
            System.out.println(agency.getAgencyName()+":"+agency.getPrice());
        }
        }
    

}
