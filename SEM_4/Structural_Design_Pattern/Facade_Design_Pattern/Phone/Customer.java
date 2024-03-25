package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Phone;

public class Customer {
    public static void main(String[] args) {
        System.out.println("--------------------FACADE----------------------");
        System.out.println(ShopKeeper.deliverPhone(PhoneType.iPhone));
        System.out.println(ShopKeeper.deliverPhone(PhoneType.Android));
    }
}
