import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        RegularSubscription tilaus = new RegularSubscription("", "", "", 0);

        System.out.println("Please input the name of the magazine: ");
        String magazineName = input.nextLine();
        tilaus.setLehden_nimi(magazineName);

        System.out.println("Please input the subscribers name: ");
        String subsName = input.nextLine();
        tilaus.setTilaajan_nimi(subsName);

        System.out.println("Please input the billing address: ");
        String billAddress = input.nextLine();
        tilaus.setToimitusosoite(billAddress);

        System.out.println("Please input the monthly price of the subscription: ");
        double monthlyPrice = input.nextDouble();
        input.nextLine();
        tilaus.setKuukausihinta(monthlyPrice);

        System.out.println("Please input the subscription period: ");
        int subsTime = input.nextInt();
        input.nextLine();
        tilaus.setTilauksenKesto(subsTime);

        printSubscriptionInvoice(tilaus);

        StandingSubscription jatkuvatilaus = new StandingSubscription(magazineName, subsName, billAddress, monthlyPrice);

        System.out.println("Please give the discount percentage of the standing subscription: ");
        int discount = input.nextInt();
        input.nextLine();
        jatkuvatilaus.setAlennusprosentti(discount);

        printSubscriptionInvoice(jatkuvatilaus);

        input.close();
    }

    static void printSubscriptionInvoice(Subscription subs) {
        subs.printInvoice();
    }

}
