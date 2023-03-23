package at.fhv.TeamE.shared.dto;


import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;


public class EventOverviewDTO {
    private final UUID eventId;
    private final String title;
    private final String location;
    private final String description;
    private final String date;
    private final double price;

    public EventOverviewDTO(UUID eventId, String title, String location, String description, String date, double price) {
        this.eventId = eventId;
        this.title = title;
        this.location = location;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    public UUID eventId() {
        return eventId;
    }

    public String title() {
        return title;
    }

    public String location() {
        return location;
    }

    public String description() {
        return description;
    }

    public String date() {
        return date;
    }

    public double price() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventOverviewDTO that = (EventOverviewDTO) o;
        return Double.compare(that.price, price) == 0 && eventId.equals(that.eventId) && title.equals(that.title) && location.equals(that.location) && description.equals(that.description) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, title, location, description, date, price);
    }
}

