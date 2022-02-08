public class InsuranceInfo {

    private double insuranceValue;
    private Property property;

    public InsuranceInfo(double insuranceValue, Property property) {
        this.insuranceValue = insuranceValue;
        this.property = property;
    }

    public double getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(double insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public String getProperty() {
        return "Property type: " + property.getPropertyType() + "\nProperty location: " + property.getPropertyLocation();
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
