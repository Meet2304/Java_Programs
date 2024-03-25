package SEM_4.Builder_Class;

public class Computer2 {
    // Compulsory Parameters
    private String HDD;
    private String RAM;
    // Optional Parameters
    private boolean IsGraphicsCardEnabled;
    private boolean IsBluetoothEnabled;

    //Getter Methods
    public String getHDD()
    {
        return this.HDD;
    }
    public String getRAM()
    {
        return this.RAM;
    }
    public boolean getGraphics()
    {
        return this.IsGraphicsCardEnabled;
    }
    public boolean getBluetooth()
    {
        return this.IsBluetoothEnabled;
    }

    private Computer2(ComputerBuilder Builder)
    {
        this.HDD = Builder.HDD;
        this.RAM = Builder.RAM;

        this.IsGraphicsCardEnabled = Builder.IsGraphicsCardEnabled;
        this.IsBluetoothEnabled = Builder.IsBluetoothEnabled;
    }
}


