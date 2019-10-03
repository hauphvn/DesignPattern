package test.factory;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import pattern.factory.Computer;
import pattern.factory.ComputerFactory;

public class MainTestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("server");
        System.out.println(pc);
    }
}
