package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.EventOverviewDTO;

import java.rmi.Remote;
import java.util.List;

public interface RMI_EventService extends Remote {
    List<EventOverviewDTO> searchArtistOrEvent(String searchString);
}
