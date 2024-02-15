import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class Main {
    //create a boilerplate CLI menu
    public static void main(String[] args) { {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Integer livelloPersonaggio = 12;
        Integer punteggioForza = 10;
        Character.setPunteggioForza(punteggioForza); //TODO: qui il programma da errore perchè devo ancora capire come mai ma è legato a queste variabili delle caratteristiche del personaggio
        Integer numeroDiAttacchi; 
        //le liste con la progressione dovrebbero essere inizializzate subito appena avviato il programma
        System.out.println("Inizializzo la progressione dei tiri per colpire del Gunslinger:");
        CharacterProgressionClass.progressioneNumeroDiAttacchi = CharacterProgressionClass.progressioneTiriPerColpireGunslinger();
        System.out.println("Fatto!");
        //inizializzo la progressione dei Tiri Salvezza
        Map<Integer, Integer> progressioneTsTempraGunslinger = CharacterProgressionClass.progressioneTiroSalvezzaTempraGunslinger();
        Map<Integer, Integer> progressioneTsRiflessiGunslinger = CharacterProgressionClass.progressioneTiroSalvezzaRiflessiGunslinger();
        Map<Integer, Integer> progressioneTsVolontaGunslinger = CharacterProgressionClass.progressioneTiroSalvezzaVolontaGunslinger();
        
        System.out.println("Benvenuta, Sadie Adler!");
        while (running) {
            System.out.println("Benvenuto nel Menu di Gioco!");
            System.out.println("Seleziona una delle opzioni seguenti:");
            System.out.println("1. Effettua un Attacco Completo ");
            System.out.println("2. Effettua un Tiro Salvezza");
            System.out.println("3. Effettua un Attacco Singolo");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                // il flusso logico dovrebbe essere questo:           
                // 1. Scegli se vuoi applicare il tiro letale
                // 2. Scegli se vuoi applicare il tiro rapido
                // 3. Scegli se vuoi applicare il tiro preciso
                // 4. Comincia a tirare per colpire
                // 5. Scegli se applicare Mira Focalizzata
                // 6. A questo punto, calcola i danni
                
                System.out.println("Vuoi applicare il Tiro Letale? (si/no)");
                String decisione = scanner.next();
                Boolean tiroLetale = Feats.tiroLetale(decisione);
                System.out.println("Il tiro per colpire è: ");
                List<Integer> tiriPerColpire = Feats.tiroPerColpire(CharacterProgressionClass.progressioneBonusAttaccoBase.get(livelloPersonaggio),tiroLetale);
                System.out.println(tiriPerColpire);
                System.out.println("Il danno è: ");
                List<Integer> danni = Feats.calcoloDeiDanni(tiriPerColpire,tiroLetale);
                System.out.println(danni);
                break;
                case 2:
                System.out.println("Effettua un Tiro Salvezza sulla Tempra");
                Character.setPunteggioCostituzione(10);
                System.out.println(Character.getPunteggioCostituzione());
                System.out.println("Il tiro salvezza sulla tempra è: ");
                System.out.println(Character.calcoloTiroSalvezzaTermpra(livelloPersonaggio));
                break;
                case 3:
                System.out.println("Attacco Singolo");
                List<Integer> tiriPerColpireAttaccoSingolo = Feats.tiroPerColpire(CharacterProgressionClass.progressioneBonusAttaccoBase.get(livelloPersonaggio),false);
                System.out.println(tiriPerColpireAttaccoSingolo);
                break;
                case 4:
                running = false;
                break;
                case 5:
                System.out.println("In questa sezione del menù vedrai i tiri per colpire del livello del tuo personaggio");
                System.out.println("Inserisci il livello del tuo personaggio: ");
                livelloPersonaggio = scanner.nextInt();
                List<Integer> attacchiDelPersionaggio = CharacterProgressionClass.progressioneNumeroDiAttacchi.get(livelloPersonaggio);
                System.out.println("I tiri per colpire del tuo personaggio sono: ");
                System.out.println(attacchiDelPersionaggio);
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
