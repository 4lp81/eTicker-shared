package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class SaleDTO implements Serializable {
    private UUID saleId;
    private UUID eventId;
    private String eventName;
    private double price;
    private int amountPurchased;

    private int amountRefunded;

    public SaleDTO(){

    }

    public SaleDTO(UUID saleId, UUID eventId, String eventName, double price, int amountPurchased, int amountRefunded) {
        this.saleId = saleId;
        this.eventId = eventId;
        this.eventName = eventName;
        this.price = price;
        this.amountPurchased = amountPurchased;
        this.amountRefunded = amountRefunded;
    }

    public UUID getSaleId() {
        return saleId;
    }

    public UUID getProductId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountPurchased() {
        return amountPurchased;
    }

    public int getAmountRefunded() {
        return amountRefunded;
    }


    //First issue was here - the equals method was not implemented correctly
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDTO saleDTO = (SaleDTO) o;
        return Double.compare(saleDTO.price, price) == 0 && amountPurchased == saleDTO.amountPurchased && amountRefunded == saleDTO.amountRefunded && Objects.equals(saleId, saleDTO.saleId) && Objects.equals(eventId, saleDTO.eventId) && Objects.equals(eventName, saleDTO.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, eventId, eventName, price, amountPurchased, amountRefunded);
    }
}
