import java.util.ArrayList;

public class IsInfoContainer {

    private ArrayList<InsuranceInfo> insuranceListing = new ArrayList<>();

    public IsInfoContainer(ArrayList<InsuranceInfo> insuranceListing) {
        this.insuranceListing = insuranceListing;
    }

    public void getInsuranceListing() {
        for (InsuranceInfo insurance: insuranceListing
             ) {
            System.out.println("[Property information] {\n" + insurance.getProperty() + "\n" + "The insurance value: " + insurance.getInsuranceValue() + "\n}\n");
        }
    }

    public void getInsuranceOverThreshold(double threshold) {
        int counter = 0;
        for (InsuranceInfo insurance: insuranceListing
        ) {
            if (insurance.getInsuranceValue() >= threshold) {
                System.out.println("[Property information] {\n" + insurance.getProperty() + "\n" + "The insurance value: " + insurance.getInsuranceValue() + "\n}\n");
                counter += 1;
            }
        }
        if (counter == 0) {
            System.out.println("No insurance info found with the selected threshold");
        }
    }

    public void getInsuranceUnderThreshold(double threshold) {
        int counter = 0;
        for (InsuranceInfo insurance: insuranceListing
        ) {
            if (insurance.getInsuranceValue() <= threshold) {
                System.out.println("[Property information] {\n" + insurance.getProperty() + "\n" + "The insurance value: " + insurance.getInsuranceValue() + "\n}\n");
            counter += 1;
            }
        }
        if (counter == 0) {
            System.out.println("No insurance info found with the selected threshold");
        }
    }

    public void addInsuranceListing(InsuranceInfo insuranceInfo) {
        this.insuranceListing.add(this.insuranceListing.size() , insuranceInfo);
    }
}
