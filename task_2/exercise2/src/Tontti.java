public class Tontti {

    private String name;
    private String location;
    private double area;

    public Tontti(String newName, String newLocation, double newArea) {
        this.name = newName;
        this.location = newLocation;
        this.area = newArea;
    }

    public void setName(String name) {
        System.out.println("Enter the name please: ");
        this.name = name;
    }

    public void setLocation(String location) {
        System.out.println("Enter the location please: ");
        this.location = location;
    }

    public void setArea(double area) {
        System.out.println("Enter the area of the plot please: ");
        if (area < 0) {
            System.out.println("The area of the plot cannot be negative!");
        }
        else
            this.area = area;
    }
/*
    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public double getArea() {
        return this.area;
    }
*/
    @Override
    public String toString() {
        return "Tontti{" +
                "name='" + this.name + '\'' +
                ", location='" + this.location + '\'' +
                ", area=" + this.area +
                '}';
    }
}
