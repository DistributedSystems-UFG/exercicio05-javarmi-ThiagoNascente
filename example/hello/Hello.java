package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    String soma(int a, int b) throws RemoteException;
    String diferenca(int a, int b) throws RemoteException;
}
