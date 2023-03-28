package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.SaleDTO;

import java.util.List;
import java.util.UUID;

public interface RMI_SaleService {
    //Test
    void purchase(UUID customerId, List<SaleDTO> salesDTO);
}
