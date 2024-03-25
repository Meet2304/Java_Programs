package SEM_4.Abstract_Design_Pattern.Tech;

public class SamsungFactory implements MobileFactory{

    @Override
    public Mobile CreateMobile() {
        return new SamsungMobile();
    }

    @Override
    public OS CreateOS() {
        return new Android();        
    }
    
}
