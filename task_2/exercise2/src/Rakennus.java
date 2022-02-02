import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rakennus {

    private double area;
    private double rooms;

    private Asukas asukas;

    public Rakennus(double area, double rooms) {
        this.area = area;
        this.rooms = rooms;
        this.asukas = new Asukas();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("The area of the plot cannot be negative!");
        }
        else
            this.area = area;
    }

    public double getRooms() {
        return rooms;
    }

    public void setRooms(double rooms) {
        this.rooms = rooms;
    }

    public void setName(String Name) {
        asukas.setName(Name);
    }

    public void setBdate(String bDate) {
        asukas.setBdate(bDate);
    }

    @Override
    public String toString() {
        return "{" +
                "area=" + area +
                ", rooms=" + rooms +
                ",\nresidents=" + asukas +
                '}';
    }
}
