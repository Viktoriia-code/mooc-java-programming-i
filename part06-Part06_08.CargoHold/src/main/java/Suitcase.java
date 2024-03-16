/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author belob
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.maxWeight - this.totalWeight() >= item.getWeight()) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() +" item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() +" items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item i: this.items) {
            weight += i.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item returnObject = this.items.get(0);
        for (Item item: this.items) {
            if (returnObject.getWeight() < item.getWeight()) {
                returnObject = item;
            }
        }
        return returnObject;
    }
}
