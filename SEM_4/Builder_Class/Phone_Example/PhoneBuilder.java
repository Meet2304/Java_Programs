package SEM_4.Builder_Class.Phone_Example;

public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public PhoneBuilder setOS(String os)
    {
        this.os = os;
        return this;
    }
    public PhoneBuilder setRAM(int ram1)
    {
        this.ram = ram1;
        return this;
    }
    public PhoneBuilder setProcessor(String processor1)
    {
        this.processor = processor1;
        return this;
    }
    public PhoneBuilder setScreenSize(double screensize1)
    {
        this.screensize = screensize1;
        return this;
    }
    public PhoneBuilder setBattery(int battery1)
    {
        this.battery = battery1;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(os, ram, processor, screensize, battery);
    }

}
