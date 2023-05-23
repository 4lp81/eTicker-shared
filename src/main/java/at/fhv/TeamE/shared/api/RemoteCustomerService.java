package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.CustomerOverviewDTO;


import jakarta.ejb.Remote;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Remote
public interface RemoteCustomerService {
    List<CustomerOverviewDTO> searchCustomer(String searchString) throws Exception;

    Optional<CustomerOverviewDTO> getCustomer(UUID customerId) throws Exception;
}