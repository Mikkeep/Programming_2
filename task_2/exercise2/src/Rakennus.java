import java.util.List;

public class Rakennus {

    private double area;
    private double rooms;

    private Asukas asukas;
    private List<String> names;
    private List<String> bDates;

    public Rakennus(double area, double rooms) {
        this.area = area;
        this.rooms = rooms;
        this.asukas = new Asukas(names, bDates);
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

    public void setResidentsName(List<String> Name) {
        asukas.setName(Name);
    }

    public void setResidentsBdate(List<String> bDate) {
        asukas.setBdate(bDate);
    }

    @Override
    public String toString() {
        return "" + "area=" + area + ", rooms=" + rooms + ",\nresidents: " + asukas + "";
    }
}
