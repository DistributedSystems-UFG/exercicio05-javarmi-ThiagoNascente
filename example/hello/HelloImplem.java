package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImplem extends UnicastRemoteObject implements Hello {

    public HelloImplem(int port) throws RemoteException {
        super(port);
    }

    public String sayHello() throws RemoteException {
        return "Hello 1, this is a common hello world!";
    }

    public String soma (int a, int b) throws RemoteException {
        return "Response from " + a + " + " + b + " = " + (a + b);
    }

    public String diferenca(int a, int b) throws RemoteException{
        return "Response from " + a + " - " + b + " = " + (a - b);
    }
}
