package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class OtherHelloImplem extends UnicastRemoteObject implements OtherHello {

    public OtherHelloImplem(int port) throws RemoteException {
        super(port);
    }

    public String sayOtherHello() throws RemoteException {
        return "\n ________________________________________ \n" +
                "( Isso é outro tipo de Hello )\n" +
                " ---------------------------------------- \n" +
                "        o   ^__^\n" +
                "         o  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||";
    }

    public String multiplica(int a, int b) throws RemoteException{
        return "Response from " + a + " * " + b + " = " + (a * b);
    }

    public String divide(float a, float b) throws RemoteException{
        return "Response from " + a + " / " + b + " = " + String.format("%.2f", a / b);
    }
}
