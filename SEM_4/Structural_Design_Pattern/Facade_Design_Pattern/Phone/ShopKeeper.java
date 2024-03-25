package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Phone;

public class ShopKeeper {
    public static String deliverPhone(PhoneType phoneType)
    {
        Components comp = new Components();
        switch(phoneType)
        {
            case iPhone:
                Phone iPh = new iPhone();
                String phComp = comp.getiPhoneComponents();
                iPh.builtPhone(phComp);
                return iPh.deliverPhone();

            case Android:
                Phone Android = new AndroidPhone();
                String phComp_2 = comp.getAndroidComponents();
                Android.builtPhone(phComp_2);
                return Android.deliverPhone();
        }
        return null;
    }    
}
