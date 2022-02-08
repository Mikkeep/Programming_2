public class Property {

    private String propertyType;
    private String propertyLocation;

    public Property(String propertyType, String propertyLocation) {
        this.propertyType = propertyType;
        this.propertyLocation = propertyLocation;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }
}
