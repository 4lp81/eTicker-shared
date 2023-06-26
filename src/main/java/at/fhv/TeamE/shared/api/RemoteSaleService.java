package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.SaleDTO;
import at.fhv.TeamE.shared.dto.SaleHistoryDTO;

import at.fhv.TeamE.shared.dto.SaleOverviewDTO;
import jakarta.ejb.Remote;
import java.util.List;
import java.util.UUID;

@Remote
public interface RemoteSaleService {
    void purchase(UUID customerId, List<SaleDTO> salesDTO);

    //ToDo: idk just to fix versionNR..... maybe
    void refund(UUID customerId, UUID saleId, List<SaleDTO> salesDTO);

    List<SaleHistoryDTO> getById(String searchString);

    List<SaleHistoryDTO> saleHistoryFull();
    List<SaleOverviewDTO> saleHistoryBy(String customerOrSaleId);
    SaleHistoryDTO saleDetail(UUID saleId);
}
