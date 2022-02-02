public class Tontti {

    private String name;
    private String location;
    private double area;

    private Rakennus rakennus;

    public Tontti(String newName, String newLocation, double newArea, Rakennus rakennus) {
        this.name = newName;
        this.location = newLocation;
        this.area = newArea;
        this.rakennus = rakennus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("The area of the plot cannot be negative!");
        }
        else
            this.area = area;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Plot = {" +
                "name=" + this.name +
                ", location=" + this.location +
                ", area=" + this.area +
                ",\nbuilding=" + this.rakennus +
                '}';
    }
}
