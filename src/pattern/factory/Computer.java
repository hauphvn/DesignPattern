package pattern.factory;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();

    @Override
    public String toString() {
        return "CPU: "+getCPU()+" RAM: "+getRAM();
    }
}
