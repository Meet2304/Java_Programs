package SEM_4.Builder_Class.Phone_Example;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public Phone( String o, int r, String p, double s, int b)
    {
        this.os = o;
        this.ram = r;
        this.processor = p;
        this.screensize = s;
        this.battery = b;
    }

    @Override
    public String toString()
    {
        return "Phone \nOS: " + os + "\nRAM: " + ram + "\nProcessor: " + processor + "\nScreensize: " + screensize + "\nBattery: " + battery;
    }
}

