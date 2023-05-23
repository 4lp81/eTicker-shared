package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.EventOverviewDTO;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface RemoteEventService {
    List<EventOverviewDTO> searchArtistOrEvent(String searchString);
    List<EventOverviewDTO> filterTheatre();
    List<EventOverviewDTO> filterConcert();
    List<EventOverviewDTO> filterFestival();

}
