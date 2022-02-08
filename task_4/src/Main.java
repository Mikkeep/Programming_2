import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please insert the number of properties you wish to insure ( Minimum of 5 ): ");
        int properties = input.nextInt();
        if (properties < 5) {
            System.out.println("The minimum amount of properties is 5");
            System.exit(1);
        }
        // nextInt does not take newLine() so we take it away here to not skip any future inputs
        input.nextLine();

        //List init
        ArrayList<InsuranceInfo> insuranceListing = new ArrayList<>();
        IsInfoContainer isInfoContainer = new IsInfoContainer(insuranceListing);

        for (int i = 0; i < properties; i++) {
            System.out.println("Please provide the type of insured property: ");
            String propertyType = input.nextLine();

            System.out.println("Please provide the location of insured property: ");
            String propertyLocation = input.nextLine();

            System.out.println("Please provide the insurance value of insured property: ");
            double insuranceValue = input.nextDouble();
            if (insuranceValue < 0) {
                System.out.println("The insurance value cannot be negative!");
                System.exit(1);
            }
            input.nextLine();

            InsuranceInfo insuranceInfo = new InsuranceInfo(insuranceValue, new Property(propertyType, propertyLocation));
            isInfoContainer.addInsuranceListing(insuranceInfo);
        }

        System.out.println("Printing the insured properties information: \n");
        isInfoContainer.getInsuranceListing();

        System.out.println("Insert threshold to see the properties over this value: ");
        double threshold = input.nextDouble();
        if (threshold < 0) {
            System.out.println("The selected threshold cannot be negative");
        }
        isInfoContainer.getInsuranceOverThreshold(threshold);

        System.out.println("Insert threshold to see the properties under this value: ");
        threshold = input.nextDouble();
        if (threshold < 0) {
            System.out.println("The selected threshold cannot be negative");
        }
        isInfoContainer.getInsuranceUnderThreshold(threshold);

    }
}
