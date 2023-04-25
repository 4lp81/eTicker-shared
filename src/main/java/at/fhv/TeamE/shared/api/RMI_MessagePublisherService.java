package at.fhv.TeamE.shared.api;

import java.rmi.RemoteException;

public interface RMI_MessagePublisherService {
    public void publish(String topic, String title, String message) throws RemoteException;
}
