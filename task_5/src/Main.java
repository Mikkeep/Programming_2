import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the name of the plot: ");
        String plotName = input.nextLine();

        System.out.println("Please input the address of the plot: ");
        String plotAddress = input.nextLine();

        System.out.println("Please input the area of the plot: ");
        int plotArea = input.nextInt();

        // takes away the empty newLine() to not mess up any future inputs
        input.nextLine();

        ArrayList<Asukas> residentList = new ArrayList<>();

        // as stated in the ENG documentation, 1.kerrostalo, 2.rivitalo ja 3.omakotitalo
        System.out.println("Choose an option to add a building type: ");
        System.out.println("1. Block of flats");
        System.out.println("2. Terraced house");
        System.out.println("3. Detached house");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {

            case 1 -> {
                double rooms = input.nextDouble();
                input.nextLine();
                int buildingAmnt = input.nextInt();
                input.nextLine();
//                Kerrostalo kerrostalo = new Kerrostalo();
            }

            default -> throw new IllegalStateException("Unexpected value: " + input);
        }

    }

}
