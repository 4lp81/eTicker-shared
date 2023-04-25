package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.SaleDTO;
import at.fhv.TeamE.shared.dto.SaleHistoryDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface RMI_SaleService extends Remote {
    //ToDo: Refund maybe later in the second sprint.....
    void purchase(UUID customerId, List<SaleDTO> salesDTO) throws RemoteException;

    void refund(UUID saleId, List<SaleDTO> salesDTO) throws RemoteException;

    List<SaleHistoryDTO> getById(String searchString) throws RemoteException;

    List<SaleHistoryDTO> saleHistoryFull() throws RemoteException;
    List<SaleHistoryDTO> saleHistoryBy(String customerOrSaleId) throws RemoteException;
    SaleHistoryDTO saleDetail(UUID saleId) throws RemoteException;
}
