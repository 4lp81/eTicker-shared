package at.fhv.TeamE.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_MessagePublisherService extends Remote {
    public void publish(String topic, String title, String message) throws RemoteException;
}
