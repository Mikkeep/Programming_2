public class Tontti {

    private String name;
    private String address;
    private double area;

    private Rakennus rakennus;

    public Tontti(String newName, String newAddress, double newArea, Rakennus rakennus) {
        this.name = newName;
        this.address = newAddress;
        this.area = newArea;
        this.rakennus = rakennus;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("The area of the plot cannot be negative!");
        } else this.area = area;
    }

    public void printPlot() {
        System.out.println("" +
                "Plot = {\n" +
                "name= " + getName() + " " +
                "address= " + getAddress() + " " +
                "area= " + getArea() + " " +
                "\n}");
        System.out.println("building type: " +
                rakennus.getClass().getName() +
                "");
        System.out.println("building apartments: " +
                rakennus.getApartmentsAmnt() +
                "");
        System.out.println("Apartments information: ");
        rakennus.printBuilding();
    }

    @Override
    public String toString() {
        return "Plot = {" + "name=" + this.name + ", address=" + this.address + ", area=" + this.area + ",\nbuilding: " +rakennus + "" + '}';
    }

}