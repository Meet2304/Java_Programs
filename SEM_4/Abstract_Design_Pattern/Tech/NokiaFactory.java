package SEM_4.Abstract_Design_Pattern.Tech;

public class NokiaFactory implements MobileFactory {
    @Override
    public Mobile CreateMobile() {
        return new NokiaMobile();
    }

    @Override
    public OS CreateOS() {
        return new Windows();        
    }
}
