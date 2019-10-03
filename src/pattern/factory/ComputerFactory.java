package pattern.factory;

public class ComputerFactory {
    public static Computer getComputer(String type){
        Computer computer = null;
        if (type.equalsIgnoreCase("server")){
            computer = new Server();
        }else if (type.equalsIgnoreCase("pc")){
            computer = new PC();
        }
        return computer;
    }
}
