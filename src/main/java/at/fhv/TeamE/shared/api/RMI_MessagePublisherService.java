package at.fhv.TeamE.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Timestamp;

public interface RMI_MessagePublisherService extends Remote {
    void publish(String topic, String title, String message, Timestamp timestamp) throws RemoteException;
}
