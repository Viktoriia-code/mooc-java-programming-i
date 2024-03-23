import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;
    
    public GradeStatistics() {
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        this.grades.add(grade);
    }
    
    public void printsStars() {
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (Integer g: this.grades) {
                if (g == grade) {
                    System.out.print("*");
                }
            }
            System.out.println("");

            grade = grade - 1;
        }
    }
}
