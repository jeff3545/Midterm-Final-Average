//Jeff Smith
//Project2a
//1/20/23
// Project 2a, Java source code with errors.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Enter midterm and final scores, separated by a comma: ");
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] fields = line.split(",");
            int midtermScore = Integer.parseInt(fields[0]);
            int finalScore = Integer.parseInt(fields[1]);
            double courseScore = midtermScore * 0.4 + finalScore * 0.6;
            System.out.println("Course Score: " + courseScore);

        }
    }
}
