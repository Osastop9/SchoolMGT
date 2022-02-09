package TransportSystem;

public class Passengers {
    private String name;
    private int id;
    private String destination;
    private int fares;

    public Passengers(String name, int id, String destination, int fares){
        this.name = name;
        this.id = id;
        this.destination = destination;
        this.fares = fares;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public int getFares() {
        return fares;
    }

}
