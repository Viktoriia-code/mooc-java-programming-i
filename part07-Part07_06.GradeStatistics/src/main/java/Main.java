import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointStatistics pointStats = new PointStatistics();
        GradeStatistics gradeStats = new GradeStatistics();
 
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.parseInt(scanner.nextLine());
            if (point == -1) {
                break;
            } else if (point >= 0 && point <= 100) {
                pointStats.addPoint(point);
                gradeStats.addGrade(point);
            }
        }
        
        
        if (pointStats.averagePoint() == 0) {
            System.out.println("Point average (all): -");
        } else {
            System.out.println("Point average (all): " + pointStats.averagePoint());
        }

        if (pointStats.averagePassingPoint() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + pointStats.averagePassingPoint());
        }
        
        System.out.println("Pass percentage: " + pointStats.passPercentage());
        System.out.println("Grade distribution:");
        gradeStats.printsStars();
    }
}
