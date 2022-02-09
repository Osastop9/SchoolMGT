package TransportSystem;

import java.util.List;

public class Parks {
    private List<Passengers> passengers;
    private List<Drivers> drivers;
    private String location;
    private int revenue;

    public Parks(List<Passengers> passengers, String location, List<Drivers> drivers) {
        this.passengers = passengers;
        this.drivers = drivers;
        this.location = location;
        revenue = 0;
    }

    public List<Passengers> getPassengers() {
        return passengers;
    }

    public void addPassengers(Passengers passenger) {
        passengers.add(passenger);
    }

    public List<Drivers> getDrivers() {
        return drivers;
    }

    public void addDrivers(Drivers driver) {
        drivers.add(driver);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRevenue() {
        return revenue;
    }

    public void updateRevenue(int revenue) {
        this.revenue = revenue;
    }
}
