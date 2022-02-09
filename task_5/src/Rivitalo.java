import java.util.ArrayList;
import java.util.HashMap;

public class Rivitalo extends Rakennus {

    public Rivitalo(int apartmentsAmnt, ArrayList<Asunto> apartmentsList) {
        super(apartmentsAmnt, apartmentsList);
    }

    @Override
    public void printBuilding() {
        for (Asunto asunto: getApartmentsList()
        ) {
            System.out.println("" +
                    "Apartment size: " + asunto.getArea() + "\n" +
                    "Apartment rooms: " + asunto.getRooms() + "\n" +
                    "Residents of the apartment: ");
            for (Asukas asukas: asunto.getAsukas()) {
                System.out.println("" +
                        "name: " +
                        asukas.getName() +
                        " ");
            }
        }
    }
}
