import java.util.ArrayList;

public class Asunto {

    private double rooms;
    private double area;
//    private Asukas asukas;
    private ArrayList<Asukas> residentsList = new ArrayList<>();

    public Asunto(double rooms, double area, ArrayList<Asukas> asukas) {
        this.rooms = rooms;
        this.area = area;
        this.residentsList = asukas;
    }

    public ArrayList<Asukas> getAsukas() {
        return residentsList;
    }

    public void addAsukas(Asukas asukas) {
        this.residentsList.add(this.residentsList.size(), asukas);
    }

    public void setAsukas(ArrayList<Asukas> asukas) {
        this.residentsList = asukas;
    }

    public double getRooms() {
        return rooms;
    }

    public void setRooms(double rooms) {
        if (rooms < 1) {
            System.out.println("The apartment should have at least one room!");
        }
        else this.rooms = rooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("The area of an apartment cannot be negative!");
        } else this.area = area;
    }
}
