
public class Statistics {
    private int numberCount;
    private int sum;

    public Statistics() {
        this.numberCount = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.numberCount += 1;
        this.sum += number;
    }

    public int getCount() {
        return this.numberCount;
    }
    
    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.numberCount == 0) {
            return 0;
        } else {
            return (double)this.sum / this.numberCount;
        }
    }
}
