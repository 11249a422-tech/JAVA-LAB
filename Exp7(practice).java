
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TopperFinder {
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);

            String topper = "";
            int highestMarks = -1;

            while (sc.hasNext()) {
                String name = sc.next();
                int marks = sc.nextInt();

                if (marks > highestMarks) {
                    highestMarks = marks;
                    topper = name;
                }
            }

            sc.close();

            System.out.println("Topper Name: " + topper);
            System.out.println("Highest Marks: " + highestMarks);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
