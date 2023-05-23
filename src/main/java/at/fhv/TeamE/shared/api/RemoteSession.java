package at.fhv.TeamE.shared.api;


import jakarta.ejb.Remote;

@Remote
public interface RemoteSession {
    boolean authenticate(String username, String password);

    //ToDo: change RMI_CustomerService in later stages
    // Shitshit
    String username();
    RMI_CustomerService rmi_customerService();

    RemoteEventService eventService();
    RemoteSaleService saleService();

    RemoteMessageConsumerService messageConsumerService();
    RemoteMessagePublisherService messagePublisherService();
}