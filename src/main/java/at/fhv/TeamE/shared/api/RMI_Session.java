package at.fhv.TeamE.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_Session extends Remote {
    String username() throws RemoteException;
    RMI_CustomerService rmi_customerService() throws RemoteException;

    RMI_EventService rmi_eventService() throws RemoteException;
    RMI_SaleService rmi_saleService() throws RemoteException;
}