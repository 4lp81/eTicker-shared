package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.AccountInfoDTO;
import at.fhv.TeamE.shared.dto.CustomerOverviewDTO;


import jakarta.ejb.Remote;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Remote
public interface RemoteCustomerService {

    //Here was the issue with the remote interface
    List<CustomerOverviewDTO> searchCustomer(String searchString);

    CustomerOverviewDTO getCustomer(UUID customerId);

    List<AccountInfoDTO> accountInfo();


}