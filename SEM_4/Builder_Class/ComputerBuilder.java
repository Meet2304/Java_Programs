package SEM_4.Builder_Class;

//Builder Class

public abstract class ComputerBuilder{
    // Compulsory Parameters
    private String HDD;
    private String RAM;
    // Optional Parameters
    private boolean IsGraphicsCardEnabled;
    private boolean IsBluetoothEnabled;
    
    //Constructors
    public ComputerBuilder( String hdd, String ram)
    {
        this.HDD = hdd;
        this.RAM = ram;
    }

    public ComputerBuilder setGraphicsCardEnabled( boolean IsGraphicsCardEnabled)
    {
        this.IsGraphicsCardEnabled = IsGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled( boolean IsBluetoothEnabled)
    {
        this.IsBluetoothEnabled = IsBluetoothEnabled;
        return this;
    }
}

