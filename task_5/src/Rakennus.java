import java.util.ArrayList;

abstract class Rakennus {

    private int buildingsAmnt;
    private double rooms;
    private double area;
    private ArrayList<Asukas> residentsList = new ArrayList<>();

    public Rakennus(double area, double rooms, int buildingsAmnt) {
        this.area = area;
        this.rooms = rooms;
        this.buildingsAmnt = buildingsAmnt;

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("The area of the plot cannot be negative!");
        } else this.area = area;
    }

    public double getRooms() {
        return rooms;
    }

    public void setRooms(double rooms) {
        if (rooms < 0) {
            System.out.println("The amount of rooms in a building cannot be negative");
        } else this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "" + "area=" + area + ", rooms=" + rooms + ",\nresidents: " + "";
    }
}