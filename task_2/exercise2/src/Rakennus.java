import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rakennus {

    private double area;
    private double rooms;
    private double residents;
    private Asukas asukas;

    public Rakennus(double area, double rooms, double residents) {
        this.area = area;
        this.rooms = rooms;
        this.residents = residents;
        this.asukas = new Asukas("Matti Meikalainen", "");
        asukas.setBdate("15.08.1996");

/*        Scanner input = new Scanner(System.in);
        if (residents < 1) {
            System.out.println("Cannot add less than 1 resident to a building");
            this.residents = 0;
            // skips the for loop with 0 members if the input is faulty
        }
        else
            this.residents = residents;
        String name;
        String bDate;
        for (int i = 0; i < this.residents; i++) {
            System.out.println("Give residents name please: ");
            name = input.nextLine();
            System.out.println("Give the resident birthdate please: ");
            bDate = input.nextLine();
            asukkaat.add(new Asukas(name, bDate));
        }
*/    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRooms() {
        return rooms;
    }

    public void setRooms(double rooms) {
        this.rooms = rooms;
    }

    public double getResidents() {
        return residents;
    }

    public void setResidents(double residents) {
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "Rakennus{" +
                "area=" + area +
                ", rooms=" + rooms +
                ", asukkaat=" + asukas +
                '}';
    }
}
