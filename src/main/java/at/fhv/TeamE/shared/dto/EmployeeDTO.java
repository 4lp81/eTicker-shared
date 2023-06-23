package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDTO implements Serializable {
    private String username;

    public EmployeeDTO(){

    }

    public EmployeeDTO(String username) {
        this.username = username;
    }

    public String username() {
        return username;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "username='" + username + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
