package at.fhv.TeamE.shared.dto;

import at.fhv.TeamE.shared.SaleType;

import java.io.Serializable;
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
    private UUID productId;

    private SaleType saleType;

    private SaleDTO sales;

    private Boolean alreadyRefunded;

    public SaleHistoryDTO() {

    }


    public SaleHistoryDTO( UUID saleId, UUID customerId, String firstName, String lastName, String iban, String birthDate, String email, String address, String city, String country, String saleDate, String salePrice, String eventName, int amount, UUID productId,SaleDTO sales,SaleType saleType, Boolean alreadyRefunded) {
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
        this.productId = productId;
        this.sales = sales;
        this.saleType=saleType;
        this.alreadyRefunded=alreadyRefunded;
    }

    public UUID getSaleId() {
        return saleId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public UUID getProductId() {
        return productId;
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

    public SaleDTO getSaleDTO(){return sales;};

    public void setSaleType(SaleType saleType) {
        saleType = saleType;
    }

    public SaleType getSaleType(){return saleType;}

    public void setAlreadyRefunded(Boolean alreadyRefunded) {
        alreadyRefunded = alreadyRefunded;
    }

    public Boolean getAlreadyRefunded() {
        return alreadyRefunded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleHistoryDTO that = (SaleHistoryDTO) o;
        return amount == that.amount && Objects.equals(saleId, that.saleId) && Objects.equals(customerId, that.customerId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(iban, that.iban) && Objects.equals(birthDate, that.birthDate) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(country, that.country) && Objects.equals(saleDate, that.saleDate) && Objects.equals(salePrice, that.salePrice) && Objects.equals(eventName, that.eventName) && Objects.equals(productId, that.productId) && saleType == that.saleType && Objects.equals(sales, that.sales) && Objects.equals(alreadyRefunded, that.alreadyRefunded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, customerId, firstName, lastName, iban, birthDate, email, address, city, country, saleDate, salePrice, eventName, amount, productId, saleType, sales, alreadyRefunded);
    }
}