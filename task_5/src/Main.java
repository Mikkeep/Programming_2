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

        // Init apartment listing here since it does not need resets
        // Unlike residents list, since we add new residents to each apartment
        ArrayList<Asunto> apartmentsList = new ArrayList<>();

        // as stated in the ENG documentation, 1.kerrostalo, 2.rivitalo ja 3.omakotitalo
        System.out.println("Choose an option to add a building type: ");
        System.out.println("1. Block of flats");
        System.out.println("2. Terraced house");
        System.out.println("3. Detached house");
        System.out.println("4. Exit Program (Execution will also stop after other selections completion)");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {

            case 1 -> {
                System.out.println("Please give the number of apartments in the building");
                int apartmentAmnt = input.nextInt();
                if (apartmentAmnt < 1) {
                    System.out.println("The building should have at least one apartment");
                    System.exit(1);
                }
                input.nextLine();
                Kerrostalo kerrostalo = new Kerrostalo(0, apartmentsList);
                kerrostalo.setApartmentsAmnt(apartmentAmnt);
                for (int i = 0; i < apartmentAmnt; i++) {
                    // resident list init for every Asunto object
                    ArrayList<Asukas> residentList = new ArrayList<>();
                    Asunto asunto = new Asunto(0, 0, residentList);

                    System.out.printf("Please give %d. apartment area: \n", i + 1);
                    double area = input.nextDouble();
                    input.nextLine();

                    System.out.printf("Please give %d. apartment rooms: \n", i + 1);
                    int rooms = input.nextInt();
                    input.nextLine();

                    System.out.println("Please give the amount of residents in the apartment: ");
                    int residentAmount = input.nextInt();
                    if (residentAmount < 0) {
                        System.out.println("The apartment must have at least one resident!");
                        System.exit(1);
                    }
                    input.nextLine();

                    for (int j = 0; j < residentAmount; j++) {

                        System.out.printf("Please give the name of the %d. resident: ", j+1);
                        String residents = input.nextLine();
                        Asukas asukas = new Asukas(null);
                        asukas.setName(residents);
                        residentList.add(residentList.size(), asukas);
                    }

                    asunto.setArea(area);
                    asunto.setRooms(rooms);

                    kerrostalo.addApartmentsList(asunto);
                }
                Tontti tontti = new Tontti("", "", 0, null);
                tontti.setName(plotName);
                tontti.setAddress(plotAddress);
                tontti.setArea(plotArea);
                tontti.setRakennus(kerrostalo);
                tontti.printPlot();
            }

            case 2 -> {
                System.out.println("Please give the number of apartments in the building");
                int apartmentAmnt = input.nextInt();
                if (apartmentAmnt < 1) {
                    System.out.println("The building should have at least one apartment");
                    System.exit(1);
                }
                input.nextLine();
                Rivitalo rivitalo = new Rivitalo(0, null);
                rivitalo.setApartmentsList(apartmentsList);
                rivitalo.setApartmentsAmnt(apartmentAmnt);
                for (int i = 0; i < apartmentAmnt; i++) {

                    ArrayList<Asukas> residentList = new ArrayList<>();
                    Asunto asunto = new Asunto(0, 0, null);
                    asunto.setResidentsList(residentList);

                    System.out.printf("Please give %d. apartment area: \n", i + 1);
                    double area = input.nextDouble();
                    input.nextLine();

                    System.out.printf("Please give %d. apartment rooms: \n", i + 1);
                    int rooms = input.nextInt();
                    input.nextLine();

                    System.out.println("Please give the amount of residents in the apartment: ");
                    int residentAmount = input.nextInt();
                    if (residentAmount < 0) {
                        System.out.println("The apartment must have at least one resident!");
                        System.exit(1);
                    }
                    input.nextLine();

                    for (int j = 0; j < residentAmount; j++) {

                        System.out.printf("Please give the name of the %d. resident: ", j+1);
                        String residents = input.nextLine();
                        Asukas asukas = new Asukas(null);
                        asukas.setName(residents);
                        residentList.add(residentList.size(), asukas);
                    }

                    asunto.setArea(area);
                    asunto.setRooms(rooms);

                    rivitalo.addApartmentsList(asunto);
                }

                Tontti tontti = new Tontti("", "", 0, null);
                tontti.setName(plotName);
                tontti.setAddress(plotAddress);
                tontti.setArea(plotArea);
                tontti.setRakennus(rivitalo);
                tontti.printPlot();
            }

            case 3 -> {
                int apartmentAmnt = 1;
                Omakotitalo omakotitalo = new Omakotitalo(0, null);
                omakotitalo.setApartmentsList(apartmentsList);
                omakotitalo.setApartmentsAmnt(apartmentAmnt);

                System.out.println("Please give the apartment area: ");
                double area = input.nextDouble();
                if (area < 0) {
                    System.out.println("The area of the apartment should not be negative!");
                    System.exit(1);
                }
                input.nextLine();

                System.out.println("Please give the apartment rooms: ");
                int rooms = input.nextInt();
                if (rooms < 1) {
                    System.out.println("The amount of rooms in the apartment should be at least one!");
                    System.exit(1);
                }
                input.nextLine();

//                omakotitalo.setApartment(area, rooms);
                System.out.println("Please give the amount of residents in the apartment: ");
                int residentAmount = input.nextInt();
                if (residentAmount < 0) {
                    System.out.println("The apartment must have at least one resident!");
                    System.exit(1);
                }
                input.nextLine();

                ArrayList<Asukas> residentList = new ArrayList<>();
                for (int j = 0; j < residentAmount; j++) {
                    System.out.printf("Please give the name of the %d. resident: ", j+1);
                    String residents = input.nextLine();
                    Asukas asukas = new Asukas(null);
                    asukas.setName(residents);
                    residentList.add(residentList.size(), asukas);
                }
                Asunto asunto = new Asunto(0, 0, null);
                asunto.setAsukas(residentList);
                asunto.setRooms(rooms);
                asunto.setArea(area);

                omakotitalo.addApartmentsList(asunto);

                Tontti tontti = new Tontti("", "", 0, null);
                tontti.setName(plotName);
                tontti.setAddress(plotAddress);
                tontti.setArea(plotArea);
                tontti.setRakennus(omakotitalo);
                tontti.printPlot();
            }

            case 4 -> {
                System.out.println("Exiting program\n");
                System.exit(1);
            }

            default -> throw new IllegalStateException("Unexpected value: " + input);
        }
    }
}
