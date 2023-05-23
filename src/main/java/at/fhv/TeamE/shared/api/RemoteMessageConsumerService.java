package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.MessageDTO;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface RemoteMessageConsumerService {

    //ToDo: acknowledge message...
    List<MessageDTO> getMessagesFromSubscribedTopics(String userName);

    //Für notification und so
    void notifyUser(String userName, String message);

    void acknowledgeMessage(String userName, MessageDTO message);

}
