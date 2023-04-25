package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.MessageDTO;

import java.rmi.RemoteException;
import java.util.List;

public interface RMI_MessageConsumerService {
    public List<MessageDTO> getMessagesFromSubscribedTopics(String userName) throws RemoteException;
}
