package Practice;

class Bill{
    protected int no_of_unit;
    protected int charge_per_unit;
    protected int BillId;
    static int count = 0;

    // Initializer block
    {
        count++;
    }

    //Default Constructor
    public Bill(){
        no_of_unit = 10;
        charge_per_unit = 10;
        BillId = 0;
    }

    //Parametrized Constructor
    public Bill(int u, int c, int i){
        this.no_of_unit = u;
        this.charge_per_unit = c;
        this.BillId = i;
    }
    //Copy Constructor
    public Bill(Bill b){
        this.no_of_unit = b.no_of_unit;
        this.charge_per_unit = b.charge_per_unit;
        this.BillId = b.BillId;
    }
    //Getter Methods
    public int GetUnits(){
        return this.no_of_unit;
    }
    public int GetCharge(){
        return this.charge_per_unit;
    }
     public int GetBillID(){
        return this.BillId;
    }

    //Setter Methods
    public void SetUnits(int u){
        this.no_of_unit = u;
    }
    
    public void SetCharge(int c){
        this.charge_per_unit = c;
    }

    public void printBillDetails(){
        System.out.println("Bill Details:");
        System.out.println("No of Units:" + this.no_of_unit);
        System.out.println("Charge per Unit: " + this.charge_per_unit);
        System.out.println("BillId: " + this.BillId);
    }
    double calculateBillAmount(){
         return (this.no_of_unit)*(this.charge_per_unit);
    }
    static void totalBillCount(){
        System.out.println("Bill Count:" + count);
    }
}

//Derived Class Electricity Bill

class ElectricityBill extends Bill{
    double calculateBillAmount(){
        return (this.no_of_unit)*(this.charge_per_unit) + 0.02*((this.no_of_unit)*(this.charge_per_unit));
    }
    // double calculateBillAmount(double billamount){
    //     return billamount + 0.02*billamount;
    // }
}

//Derived Class Milk Bill

class MilkBill extends Bill{
    protected int supplierCharge = 100;

    //Overriden PrintBill
    public void printBillDetails(){
        System.out.println("MilkBill Details:");
        System.out.println("No of Units:" + this.no_of_unit);
        System.out.println("Charge per Unit: " + this.charge_per_unit);
        System.out.println("BillId: " + this.BillId);
        System.out.println("Supplier Charge: " + this.supplierCharge);
    }

    //Overriden calculateBillAmount
    double calculateBillAmount(){
        return ((this.no_of_unit)*(this.charge_per_unit) + 0.02*((this.no_of_unit)*(this.charge_per_unit)) + this.supplierCharge);
    }
}
public class InheritanceTest {
    public static void main(String[] args){
        Bill B1 = new Bill(5, 25, 101);
        Bill B2 = new Bill();
        Bill E2 = new ElectricityBill();
        B1.printBillDetails();
        B1.totalBillCount();
        B2.SetUnits(20);
        B2.SetCharge(5);
        B2.printBillDetails();
        System.out.println("Bill Amount of B1: " + B1.calculateBillAmount());
        System.out.println("Bill Amount of B2: " + B2.calculateBillAmount());
        ElectricityBill E1 = new ElectricityBill();
        System.out.println("Bill Amount of E1: " + E1.calculateBillAmount());
        MilkBill M1 = new MilkBill();
        M1.printBillDetails();
        System.out.println("Bill Amount of M1: " + M1.calculateBillAmount());
        //double ElecBill = B1.calculateBillAmount();
        //System.out.println("Bill Amount of E1: " + E1.calculateBillAmount(ElecBill));        
    }

}    
