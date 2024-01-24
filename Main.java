import java.util.List;
import java.util.Scanner;

public class Main {
    //create a boilerplate CLI menu
    public static void main(String[] args) { {
                Scanner scanner = new Scanner(System.in);
                boolean running = true;
        
        while (running) {
            System.out.println("Benvenuto nel Menu di Gioco!");
            System.out.println("Seleziona una delle opzioni seguenti:");
            System.out.println("1. Effettua un Attacco ");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Il tiro per colpire è: ");
                    List<Integer> tiriPerColpire = Feats.tiroPerColpire(1);
                    System.out.println(tiriPerColpire);
                    System.out.println("Il danno è: ");
                    List<Integer> danni = Feats.calcoloDeiDanni(tiriPerColpire);
                    System.out.println(danni);
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    break;
                case 3:
                    System.out.println("Option 3 selected");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        
        scanner.close();
    }
    }
}
