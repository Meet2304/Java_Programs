package SEM_4.Abstract_Design_Pattern.Tech;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // SAMSUNG FACTORY
        System.out.println("SAMSUNG FACTORY");
        MobileFactory samsungfactory = new SamsungFactory();
        Mobile samsungS24 = samsungfactory.CreateMobile();
        OS ONEUI = samsungfactory.CreateOS();

        samsungS24.DisplayInfo();
        ONEUI.DisplayOS();
        System.out.println("");

        // NOKIA FACTORY
        System.out.println("NOKIA FACTORY");
        MobileFactory nokiafactory = new NokiaFactory();
        Mobile nokialumia = nokiafactory.CreateMobile();
        OS nokiaos = nokiafactory.CreateOS();

        nokialumia.DisplayInfo();
        nokiaos.DisplayOS();
        System.out.println("");

        // APPLE FACTORY
        System.out.println("APPLE FACTORY");
        MobileFactory applefactory = new AppleFactory();
        Mobile iphone15 = applefactory.CreateMobile();
        OS ios17 = applefactory.CreateOS();

        iphone15.DisplayInfo();
        ios17.DisplayOS();
        System.out.println("");
    }
}
