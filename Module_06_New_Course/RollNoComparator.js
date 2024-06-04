import java.util.Comparator;

public class RollNoComparator implements Comparator<newStudent> {


    public int compare(newStudent s1, newStudent s2) {
    return s1.getRollno() - s2.getRollno();
}
}