package at.fhv.TeamE.shared.api;

import jakarta.ejb.Remote;
import java.sql.Timestamp;

@Remote
public interface RemoteMessagePublisherService {
    void publish(String topic, String title, String message, Timestamp timestamp, String username);
}
