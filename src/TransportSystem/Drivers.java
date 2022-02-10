package TransportSystem;


public class Drivers {
    String name;
    String vehicleModel;
    int id;
    String Route;
    int tax;

    public Drivers(String name, String vehicleModel, int id, String Route, int tax){
        this.name = name;
        this.id = id;
        this.vehicleModel = vehicleModel;
        this.Route = Route;
        this.tax = tax;

    }

    public String getName() {
        return name;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getId() {
        return id;
    }

    public String getRoute() {
        return Route;
    }

    public int getTax() {
        return tax;
    }

}
