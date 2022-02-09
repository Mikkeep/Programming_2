import java.util.ArrayList;

abstract class Rakennus {

    private int apartmentsAmnt;
    private ArrayList<Asunto> apartmentsList;

    public Rakennus(int apartmentsAmnt, ArrayList<Asunto> apartmentsList) {
        this.apartmentsAmnt = apartmentsAmnt;
        this.apartmentsList = apartmentsList;
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