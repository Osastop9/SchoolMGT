package TransportSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Drivers osas = new Drivers("Osas", "Nissan", 122, "Ikpoba Hill", 500);
        Drivers ade = new Drivers("Ade", "Nissan", 735, "Ring road", 500);
        Drivers ifeanyi = new Drivers("Ifeanyi", "Mitsubushi", 776, "Airport Road", 1000);

        List<Drivers> driversList = new ArrayList<>();
        driversList.add(osas);
        driversList.add(ade);
        driversList.add(ifeanyi);

        Passengers tolu = new Passengers("Tolu", 1056, "Ugbowo", 300);
        Passengers daisy = new Passengers("Daisy", 6332, "Airport Road", 1000);
        Passengers obasa = new Passengers("obasa", 2006, "Ring Road", 730);

        List<Passengers> passengersList = new ArrayList<>();
        passengersList.add(tolu);
        passengersList.add(daisy);
        passengersList.add(obasa);

        for(int i = 0; i < driversList.size(); i++){
            System.out.println(driversList.get(i).Route);
        }

    }
}
