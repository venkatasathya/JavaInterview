package streams;

import java.util.Objects;

public class Location {
    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location)) return false;
        return getLocationId() == location.getLocationId() && getCity().equals(location.getCity()) && getState().equals(location.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocationId(), getCity(), getState());
    }

    int locationId;

    public Location(int locationId, String city, String state) {
        this.locationId = locationId;
        this.city = city;
        this.state = state;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public  String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Location() {
    }

    String city;
String state;

}
