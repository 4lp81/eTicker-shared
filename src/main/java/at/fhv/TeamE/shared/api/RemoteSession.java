package at.fhv.TeamE.shared.api;


import jakarta.ejb.Remote;

@Remote
public interface RemoteSession {

    //ToDo: alles
    boolean authenticate(String username, String password);

    String username();
    RMI_CustomerService rmi_customerService();

    RemoteEventService eventService();
    RemoteSaleService saleService();

    RemoteEmployeeService employeeService();

    RemoteMessageConsumerService messageConsumerService();
    RemoteMessagePublisherService messagePublisherService();
}