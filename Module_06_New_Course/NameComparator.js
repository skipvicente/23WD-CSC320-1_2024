import java.util.Comparator;

public class NameComparator implements Comparator<newStudent> {

    public int compare(newStudent s1, newStudent s2) {
    return s1.getName().compareTo(s2.getName());
}
}