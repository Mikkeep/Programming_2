public class Asukas {

    private String name;
    private String bdate;

    public Asukas(String name, String bdate) {
        this.name = name;
        this.bdate = bdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", birthdate='" + bdate + '\'' +
                '}';
    }
}
