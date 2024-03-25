package SEM_4.Builder_Class.Phone_Example;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOS("Android").setRAM(12).setBattery(4000).setProcessor("Snapdragon").getPhone();
        System.out.println(p);
        PhoneBuilder1 p1 = new PhoneBuilder1();
        p1.setOS("Android");
        p1.setProcessor("Mediatech");
        System.out.println(p1.getPhone());
    }
}
