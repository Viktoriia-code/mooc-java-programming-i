import java.util.ArrayList;

public class BirdsList {
    private ArrayList<Bird> birds;
    
    public BirdsList() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void printBirds() {
        for (Bird bird: this.birds) {
            System.out.println(bird);
        }
    }
    
    public void searchByName(String name){
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void addObservation(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    
    }
}
