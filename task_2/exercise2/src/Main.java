import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the plot name please: ");
        String plotName = input.nextLine();

        System.out.println("Enter the plot location please: ");
        String location = input.nextLine();

        System.out.println("Enter the area of the plot please: ");
        double area = input.nextDouble();

        System.out.println("Enter the area of the building: ");
        double areaBuilding = input.nextDouble();

        System.out.println("Enter the amount of rooms: ");
        double rooms = input.nextDouble();

        System.out.println("Enter the amount of residents: ");
        double residents = input.nextDouble();

        // input to take newline, since next double does not take it
        // otherwise skips next string input
        input.nextLine();

        StringBuilder resNames = new StringBuilder();
        StringBuilder resBDays = new StringBuilder();

        if (residents < 1) {
            System.out.println("Cannot add less than 1 resident to a building");
            // skips the for loop with 0 members if the input is faulty
            // since we cannot have 0 residents in a building
        }
        else
            for (int i = 0; i < residents; i++) {
                System.out.printf("Enter %d. residents info: \n", i+1);
                System.out.println("Give residents name please: ");
                resNames.append(input.nextLine()).append(", ");
                System.out.println("Give the resident birthdate please: ");
                resBDays.append(input.nextLine()).append(", ");
            }

        Rakennus building = new Rakennus(0, 0);
        building.setArea(areaBuilding);
        building.setRooms(rooms);
        building.setName(resNames.toString());
        building.setBdate(resBDays.toString());

        Tontti plot = new Tontti("", "", 0, building);
        plot.setName(plotName);
        plot.setLocation(location);
        plot.setArea(area);

        System.out.println(plot);

    }
}
