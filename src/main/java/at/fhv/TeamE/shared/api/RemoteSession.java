package at.fhv.TeamE.shared.api;


import jakarta.ejb.Remote;

@Remote
public interface RemoteSession {

    //ToDo: alles
    boolean authenticate(String username, String password);

    String username();
    RemoteCustomerService customerService();

    RemoteEventService eventService();
    RemoteSaleService saleService();

    RemoteMessageConsumerService messageConsumerService();
    RemoteMessagePublisherService messagePublisherService();
}