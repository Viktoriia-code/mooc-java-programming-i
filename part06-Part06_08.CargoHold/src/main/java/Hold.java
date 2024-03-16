import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int weight;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.weight = 0;
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight - this.weight >= suitcase.totalWeight()) {
            this.weight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}
