package pattern.factory;

public class Server extends Computer{
    @Override
    public String getCPU() {
        return "CPU of Server";
    }

    @Override
    public String getRAM() {
        return "RAM of Server";
    }
}
