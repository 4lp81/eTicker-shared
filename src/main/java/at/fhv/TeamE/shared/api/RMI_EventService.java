package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.EventOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMI_EventService extends Remote {
    List<EventOverviewDTO> searchArtistOrEvent(String searchString) throws RemoteException;
    List<EventOverviewDTO> filterTheatre() throws RemoteException;
    List<EventOverviewDTO> filterConcert() throws RemoteException;
    List<EventOverviewDTO> filterFestival() throws RemoteException;

}
