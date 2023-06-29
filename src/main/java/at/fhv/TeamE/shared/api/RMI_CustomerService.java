package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.AccountInfoDTO;
import at.fhv.TeamE.shared.dto.CustomerOverviewDTO;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;



public interface RMI_CustomerService extends Remote {

    //Here was the issue with the remote interface
    List<CustomerOverviewDTO> searchCustomer(String searchString) throws RemoteException;

    CustomerOverviewDTO getCustomer(UUID customerId) throws RemoteException;

    List<AccountInfoDTO> accountInfo() throws RemoteException;


}