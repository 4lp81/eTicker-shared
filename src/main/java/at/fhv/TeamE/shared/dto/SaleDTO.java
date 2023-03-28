package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class SaleDTO implements Serializable {
    private final UUID saleId;
    private final UUID productId;
    private final String eventName;
    private final double price;
    private int amountPurchased;

    //Random Comment weil java fx zahlen ned mag
    public SaleDTO(UUID saleId, UUID productId, String eventName, double price, int amountPurchased) {
        this.saleId = saleId;
        this.productId = productId;
        this.eventName = eventName;
        this.price = price;
        this.amountPurchased = amountPurchased;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDTO saleDTO = (SaleDTO) o;
        return Double.compare(saleDTO.price, price) == 0 && amountPurchased == saleDTO.amountPurchased && saleId.equals(saleDTO.saleId) && productId.equals(saleDTO.productId) && eventName.equals(saleDTO.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, productId, eventName, price, amountPurchased);
    }
}
