package SEM_4.Abstract_Design_Pattern.Tech;

public class AppleFactory implements MobileFactory {
    @Override
    public Mobile CreateMobile() {
        return new AppleMobile();
    }

    @Override
    public OS CreateOS() {
        return new IOS();        
    }
}
