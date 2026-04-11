package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OtherHello extends Remote {
    String sayOtherHello() throws RemoteException;
    String multiplica(int a, int b) throws RemoteException;
    String divide(float a, float b) throws RemoteException;
}
