package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class SaleHistoryDTO implements Serializable {
    private UUID saleId;
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String iban;
    private String birthDate;
    private String email;
    private String address;
    private String city;
    private String country;
    private String saleDate;
    private String salePrice;
    private String eventName;
    private int amount;



    public SaleHistoryDTO() {

    }

    public SaleHistoryDTO(UUID saleId, UUID customerId, String firstName, String lastName, String iban, String birthDate, String email, String address, String city, String country, String saleDate, String salePrice, String eventName, int amount) {
        this.saleId = saleId;
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
        this.saleDate = saleDate;
        this.salePrice = salePrice;
        this.eventName = eventName;
        this.amount = amount;
    }

    public UUID getSaleId() {
        return saleId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIban() {
        return iban;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public int getAmount() {
        return amount;
    }

    // test
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleHistoryDTO that = (SaleHistoryDTO) o;
        return amount == that.amount && saleId.equals(that.saleId) && customerId.equals(that.customerId) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && iban.equals(that.iban) && birthDate.equals(that.birthDate) && email.equals(that.email) && address.equals(that.address) && city.equals(that.city) && country.equals(that.country) && saleDate.equals(that.saleDate) && salePrice.equals(that.salePrice) && eventName.equals(that.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, customerId, firstName, lastName, iban, birthDate, email, address, city, country, saleDate, salePrice, eventName, amount);
    }
}
