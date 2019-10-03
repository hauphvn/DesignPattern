package pattern.factory;

public class PC extends Computer{
    @Override
    public String getCPU() {
        return "CPU of PC";
    }

    @Override
    public String getRAM() {
        return "RAM of PC";
    }
}
