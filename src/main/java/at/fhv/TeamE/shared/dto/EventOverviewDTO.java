package at.fhv.TeamE.shared.dto;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;


public class EventOverviewDTO implements Serializable {
    private UUID eventId;
    private String title;
    private String location;
    private String description;
    private String date;
    private double price;

    public EventOverviewDTO(){

    }

    public EventOverviewDTO(UUID eventId, String title, String location, String description, String date, double price) {
        this.eventId = eventId;
        this.title = title;
        this.location = location;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    public UUID getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
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