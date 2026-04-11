package example.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        System.out.println("Initiating client");

        // Distribuido
        String protocolo = "rmi://";
        String host = protocolo + ((args.length < 1) ? null : args[0]) + "/";

        // Local
        //String protocolo = "";
        //String host = protocolo + "//localhost/";

        String name1 = "MyHello";
        String name2 = "OtherHello";

        // MyHello

        try {
            Hello stub = (Hello) Naming.lookup(host + name1);
            System.out.println("Server " + name1 + " Found!!!!");
            String response = stub.sayHello();
            System.out.println("Response: " + response);
            System.out.println(stub.soma(542, 754));
            System.out.println(stub.diferenca(65, 423));
            
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

        System.out.println();
        // OtherHello

        try {
            OtherHello stub = (OtherHello) Naming.lookup(host + name2);
            System.out.println("Server " + name2 + " Found!!!!");
            String response = stub.sayOtherHello();
            System.out.println("Response: " + response);
            System.out.println(stub.multiplica(11, 745));
            System.out.println(stub.divide(672, 45));

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }
}
