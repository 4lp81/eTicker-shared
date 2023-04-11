package at.fhv.TeamE.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_SessionFactory extends Remote {
    RMI_Session authenticate(String username, String password) throws RemoteException;
}