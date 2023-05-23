package at.fhv.TeamE.shared.api;


import jakarta.ejb.Remote;

@Remote
public interface RemoteSession {
    boolean authenticate(String username, String password);

    //ToDo: change RMI_CustomerService in later stages
    // Shitshit
    String username();
    RemoteCustomerService customerService();

    RemoteEventService eventService();
    RemoteSaleService saleService();

    RemoteMessageConsumerService messageConsumerService();
    RemoteMessagePublisherService messagePublisherService();
}