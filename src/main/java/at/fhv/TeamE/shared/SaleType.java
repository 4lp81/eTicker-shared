package at.fhv.TeamE.shared;

public enum SaleType {
    PURCHASE("Purchase"),
    REFUND("Refund");

    private final String name;

    SaleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
