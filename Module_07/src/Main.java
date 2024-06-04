import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr01 = new Scanner(System.in);
        int newScore;

        System.out.println("Enter Your Score");
        newScore = scnr01.nextInt();

        // Using List for scores
        List<Integer> listOfScores = new ArrayList<>();
        listOfScores.add(75);
        listOfScores.add(123);
        listOfScores.add(85);

        // Duplicate score permitted if user were to enter any of the existing scores
        listOfScores.add(newScore);
        System.out.println("Your scores: " + listOfScores);

        scnr01.close();



        Scanner scnr02 = new Scanner(System.in);
        String newPlayer;

        System.out.println("Enter Your Player Name");

        // Using HashSet
        Set<String> setUserName = new HashSet<>();
        setUserName.add("HotShooter");
        setUserName.add("Wildman");
        setUserName.add("NewGuy");

        // Duplicate player name not permitted
        newPlayer = scnr02.nextLine();
        setUserName.add(newPlayer);
        System.out.println("User Name List: " + setUserName.toString());

        scnr02.close();
    }
}