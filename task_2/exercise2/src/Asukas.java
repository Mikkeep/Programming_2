public class Asukas {

    private String name;
    private String bDate;

/*    public Asukas(String name, String bdate) {
        this.name = name;
        this.bdate = bdate;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBdate() {
        return bDate;
    }

    public void setBdate(String bDate) {
        this.bDate = bDate;
    }

    @Override
    public String toString() {
        return "{" +
                "names=" + name +
                ", birthdays=" + bDate +
                '}';
    }
}
