package SEM_4.Builder_Class.Phone_Example;

public class PhoneBuilder1 {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public void setOS(String os)
    {
        this.os = os;
    }
    public void setRAM(int ram1)
    {
        this.ram = ram1;
    }
    public void setProcessor(String processor1)
    {
        this.processor = processor1;
    }
    public void setScreenSize(double screensize1)
    {
        this.screensize = screensize1;
    }
    public void setBattery(int battery1)
    {
        this.battery = battery1;
    }
    public Phone getPhone()
    {
        return new Phone(os, ram, processor, screensize, battery);
    }
}
