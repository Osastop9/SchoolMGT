package TransportSystem;

//Creating a class for passenger
public class Passengers {
    private String name;
    private int id;
    private String destination;
    private int fares;

//Creating a constructor

    public Passengers(String name, int id, String destination, int fares){
        this.name = name;
        this.id = id;
        this.destination = destination;
        this.fares = fares;

    }

    //Creating getters incase there is need for a future update

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
