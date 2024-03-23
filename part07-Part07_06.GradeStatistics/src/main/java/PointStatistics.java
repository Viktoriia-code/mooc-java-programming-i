import java.util.ArrayList;

public class PointStatistics {
    private ArrayList<Integer> points;
    
    public PointStatistics() {
        this.points = new ArrayList<>();
    }
    
    public void addPoint(Integer point) {
        this.points.add(point);
    }
    
    public double averagePoint() {
        int summa = 0;
        for (Integer p: this.points) {
            summa += p;
        }
        if (summa == 0) {
            return 0;
        }
        return (double)summa/this.points.size();
    }
    
    public double averagePassingPoint() {
        int summa = 0;
        int point_amount = 0;
        for (Integer p: this.points) {
            if (p >= 50) {
                summa += p;
                point_amount += 1;
            }
        }
        if (point_amount == 0) {
            return 0;
        }
        return (double)summa/point_amount;
    }
    
    public double passPercentage() {
        int passing = 0;
        for (Integer p: this.points) {
            if (p >= 50) {
                passing += 1;
            }
        }
        return (double)100 * passing / this.points.size();
    }
}
