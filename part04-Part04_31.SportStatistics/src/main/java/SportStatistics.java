
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<String[]> statistics = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");

                statistics.add(parts);
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+ file +" failed.");
        }
        
        System.out.println("Team: ");
        String searching = scan.nextLine();
        
        int teamGames = 0;
        int wins = 0;
        int losses = 0;
        
        for (String[] team:statistics) {
            if (team[0].equals(searching)) {
                teamGames += 1;
                if (Integer.valueOf(team[2])>Integer.valueOf(team[3])) {
                    wins += 1;
                } else { 
                    losses += 1;
                } 
            }
            if (team[1].equals(searching)) {
                teamGames += 1;
                if (Integer.valueOf(team[2])>Integer.valueOf(team[3])) {
                    losses += 1;
                } else { 
                    wins += 1;
                }
            }
        }
        
        System.out.println("Games: " + teamGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
