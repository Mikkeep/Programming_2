public class Tontti {

    private String name;
    private String longitude;
    private String latitude;
    private double area;

    private Rakennus rakennus;

    public Tontti(String newName, String newLongitude, String newLatitude, double newArea, Rakennus rakennus) {
        this.name = newName;
        this.longitude = newLongitude;
        this.latitude = newLatitude;
        this.area = newArea;
        this.rakennus = rakennus;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("The area of the plot cannot be negative!");
        } else this.area = area;
    }

    @Override
    public String toString() {
        return "Plot = {" + "name=" + this.name + ", location=" + "( " + this.longitude + " , " + this.latitude + " )" + ", area=" + this.area + ",\nbuilding: " + this.rakennus + '}';
    }
}
