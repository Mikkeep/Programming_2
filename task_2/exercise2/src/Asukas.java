import java.util.List;

public class Asukas {

    private List<String> names;
    private List<String> bDates;

    public Asukas(List<String> names, List<String> bDates) {
        this.names = names;
        this.bDates = bDates;
    }

    public List<String> getName() {
        return names;
    }

    public void setName(List<String> names) {
        this.names = names;
    }

    public List<String> getBdate() {
        return bDates;
    }

    public void setBdate(List<String> bDates) {
        this.bDates = bDates;
    }

    @Override
    public String toString() {
        return "" +
                "names=" + names +
                ", birthdays=" + bDates + "\n" +
                "";
    }
}
