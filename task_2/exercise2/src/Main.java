import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the plot name please: ");
        String plotName = input.nextLine();

        System.out.println("Enter the plot longitude please: ");
        String longitude = input.nextLine();

        System.out.println("Enter the plot latitude please: ");
        String latitude = input.nextLine();

        System.out.println("Enter the area of the plot please: ");
        double area = input.nextDouble();
        if (area < 0) {
            System.out.println("Area cannot be negative");
            System.exit(1);
        }

        System.out.println("Enter the area of the building: ");
        double areaBuilding = input.nextDouble();
        if (areaBuilding < 0) {
            System.out.println("Area cannot be negative");
            System.exit(1);
        }

        System.out.println("Enter the amount of rooms: ");
        double rooms = input.nextDouble();
        if (rooms < 0) {
            System.out.println("Amount of rooms cannot be negative");
            System.exit(1);
        }

        System.out.println("Enter the amount of residents: ");
        double residents = input.nextDouble();
        if (residents < 0) {
            System.out.println("Amount of residents cannot be negative");
            System.exit(1);
        }

        // input to take newline, since next double does not take it
        // otherwise skips next string input
        input.nextLine();

        // Lists for storing and setting the resident info
        List<String> residentList = new ArrayList<>();
        List<String> residentAges = new ArrayList<>();

        if (residents < 1) {
            System.out.println("Cannot add less than 1 resident to a building");
            System.exit(1);
        } else
            for (int i = 0; i < residents; i++) {
                System.out.printf("Enter %d. residents info: \n", i + 1);
                System.out.println("Give residents name please: ");
                residentList.add(i, input.nextLine());
                System.out.println("Give the resident birthdate please: ");
                residentAges.add(i, input.nextLine());
            }

        // Residents are handled inside the building class
        Rakennus building = new Rakennus(0, 0);
        building.setArea(areaBuilding);
        building.setRooms(rooms);
        building.setResidentsName(residentList);
        building.setResidentsBdate(residentAges);

        Tontti plot = new Tontti("", "", "", 0, building);
        plot.setName(plotName);
        plot.setLongitude(longitude);
        plot.setLatitude(latitude);
        plot.setArea(area);

        System.out.println(plot);

        input.close();

    }
}
