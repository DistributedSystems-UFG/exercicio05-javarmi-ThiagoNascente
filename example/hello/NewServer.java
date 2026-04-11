package example.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class NewServer {

    public NewServer() {}

    public static void main(String args[]) {
        try {
            try {
                LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            } catch (RemoteException e) {
                System.out.println("Registry já está rodando.");
            }
            OtherHelloImplem obj = new OtherHelloImplem(5679);

            Naming.rebind("OtherHello", obj);

            System.err.println("New server ready!!!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}