package at.fhv.TeamE.shared.api;
import at.fhv.TeamE.shared.dto.EmployeeDTO;
import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface RemoteEmployeeService {

    List<EmployeeDTO> getAll();

}
