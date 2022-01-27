import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tontti plot = new Tontti("", "", 0);
        Scanner input = new Scanner(System.in);
//        System.out.println(plot);
        plot.setName(input.nextLine());
        plot.setLocation(input.nextLine());
        plot.setArea(input.nextDouble());
        System.out.println(plot);
        Rakennus building = new Rakennus(5, 3, 3);
        System.out.println(building);
    }
}
