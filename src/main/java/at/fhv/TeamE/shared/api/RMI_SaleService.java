package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.SaleDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface RMI_SaleService extends Remote {
    //ToDo: Refund maybe later in the second sprint...
    void purchase(UUID customerId, List<SaleDTO> salesDTO) throws RemoteException;
}
