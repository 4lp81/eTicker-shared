package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

//for the sale overview

public class SaleOverviewDTO implements Serializable {
    private UUID customerId;

    private UUID saleId;
    private String firstname;

    private String lastName;

    private String email;


    public SaleOverviewDTO(UUID customerId, UUID saleId, String firstname, String lastName, String email, List<SaleDTO> salesDTO) {
        this.customerId = customerId;
        this.saleId = saleId;
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID customerId() {
        return customerId;
    }

    public UUID saleId() {
        return saleId;
    }

    public String firstname() {
        return firstname;
    }

    public String lastName() {
        return lastName;
    }

    public String email() {
        return email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleOverviewDTO that = (SaleOverviewDTO) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(saleId, that.saleId) && Objects.equals(firstname, that.firstname) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, saleId, firstname, lastName, email);
    }

}
