import java.util.ArrayList;
import java.util.HashMap;

abstract class Rakennus {

    private int apartmentsAmnt;
//   private HashMap<Double, Integer> apartments = new HashMap<Double, Integer>();
//    private ArrayList<Asukas> residentsList = new ArrayList<>();
    private ArrayList<Asunto> apartmentsList = new ArrayList<Asunto>();

    public Rakennus(int apartmentsAmnt, ArrayList<Asunto> apartmentsList) {
        this.apartmentsAmnt = apartmentsAmnt;
        this.apartmentsList = apartmentsList;
//        this.apartments = apartments;
//        this.residentsList = residentsList;
    }

    public ArrayList<Asunto> getApartmentsList() {
        return apartmentsList;
    }

    public void setApartmentsList(ArrayList<Asunto> apartmentsList) {
        this.apartmentsList = apartmentsList;
    }

    public void addApartmentsList(Asunto asunto) {
        this.apartmentsList.add(this.apartmentsList.size(), asunto);
    }

    public int getApartmentsAmnt() {
        return apartmentsAmnt;
    }

    public void setApartmentsAmnt(int apartmentsAmnt) {
        this.apartmentsAmnt = apartmentsAmnt;
    }

    public abstract void printBuilding();

}