import java.util.Comparator;
public class Cricketers implements Comparable{
    private String name;
    private int jercyNumber;

    public Cricketers(String name, int jercyNumber) {
        super();
        this.name = name;
        this.jercyNumber = jercyNumber;
    }

    @Override
    public String toString() {
        return "Cricketers{" +
                "name='" + name + '\'' +
                ", jercyNumber=" + jercyNumber +
                '}';
    }

    public static Comparator<Cricketers> StuNameComparator = new Comparator<Cricketers>() {

        public int compare(Cricketers s1, Cricketers s2) {
            String CricketerName1 = s1.getCriketername().toUpperCase();
            String CricketerName2 = s2.getCriketername().toUpperCase();

            //ascending order
            return CricketerName1.compareTo(CricketerName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};

    private String getCriketername() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


