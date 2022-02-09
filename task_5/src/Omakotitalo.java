import java.util.ArrayList;
import java.util.HashMap;

class Omakotitalo extends Rakennus {

    private int apartmentAmnt;
    private HashMap<Double, Integer> apartments = new HashMap<Double, Integer>();
    private ArrayList<Asukas> residentsList = new ArrayList<>();

    public Omakotitalo(int apartmentsAmnt, ArrayList<Asunto> apartmentsList) {
        super(apartmentsAmnt, apartmentsList);
        this.apartmentAmnt = apartmentsAmnt;
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
