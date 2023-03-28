package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class SaleDTO implements Serializable {
    private UUID saleId;
    private UUID productId;
    private String eventName;
    private double price;
    private int amountPurchased;

    private int amountRefunded;

    public SaleDTO(){

    }


    public SaleDTO(UUID saleId, UUID productId, String eventName, double price, int amountPurchased, int amountRefunded) {
        this.saleId = saleId;
        this.productId = productId;
        this.eventName = eventName;
        this.price = price;
        this.amountPurchased = amountPurchased;
        this.amountRefunded = amountRefunded;
    }

    //Random Comment weil java fx zahlen ned mag



    public UUID getSaleId() {
        return saleId;
    }

    public UUID getProductId() {
        return productId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDTO saleDTO = (SaleDTO) o;
        return Double.compare(saleDTO.price, price) == 0 && amountPurchased == saleDTO.amountPurchased && amountRefunded == saleDTO.amountRefunded && saleId.equals(saleDTO.saleId) && productId.equals(saleDTO.productId) && eventName.equals(saleDTO.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, productId, eventName, price, amountPurchased, amountPurchased);
    }
}
