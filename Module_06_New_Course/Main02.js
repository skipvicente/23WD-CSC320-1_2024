import java.util.ArrayList;

public class Main02 {
    public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new newStudent(3, "John", "123 Main St"));
    students.add(new newStudent(2, "Alice", "456 Maple Ave"));
    students.add(new newStudent(1, "Bob", "789 Oak Ln"));
    students.add(new mewStudent(6, "Carol", "321 Elm St"));
    students.add(new newStudent(5, "David", "654 Pine Ave"));
    students.add(new newStudent(4, "Eve", "987 Cedar Blvd"));
    students.add(new newStudent(9, "Frank", "111 Laurel Ln"));
    students.add(new newStudent(8, "Grace", "222 Cedar Ave"));
    students.add(new newStudent(7, "Heidi", "333 Maple Ln"));
    students.add(new newStudent(10, "Ivy", "444 Oak Ave"));

    selectionSort(students, new NameComparator());
    System.out.println("Sorted " + selectionSort);