import java.util.Map;
import java.util.HashMap;

public class CharacterProgressionClass {
    
    // qui conservo le mappe di progressione dei bonus d'attacco base e dei tiri salvezza
    // idealmente ogni classe del personaggio sarà una istanza di questa classe, e avrà le sue mappe di progressione

    private Map<Integer,Integer> progressioneBonusAttaccoBase;
    private Map<Integer,Integer> progressioneTiroSalvezzaTempra;
    private Map<Integer,Integer> progressioneTiroSalvezzaRiflessi;
    private Map<Integer,Integer> progressioneTiroSalvezzaVolonta; 



    private static Map<Integer,Integer> progressioneBonusAttaccoBaseGunslinger(){
        Map<Integer,Integer> progressioneBonusAttaccoBaseGunslinger = new HashMap<Integer,Integer>();
        
        for (int i = 1; i == 20; i++) {
            progressioneBonusAttaccoBaseGunslinger.put(i, i);
        }
        return progressioneBonusAttaccoBaseGunslinger;
    };
    
    public static Map<Integer,Integer> progressioneTiroSalvezzaTempraGunslinger(){
        Map<Integer,Integer> progressioneTiroSalvezzaTempraGunslinger = new HashMap<>();
        progressioneTiroSalvezzaTempraGunslinger.put(1, 2);
        progressioneTiroSalvezzaTempraGunslinger.put(2, 3);
        progressioneTiroSalvezzaTempraGunslinger.put(3, 3);
        progressioneTiroSalvezzaTempraGunslinger.put(4, 4);
        progressioneTiroSalvezzaTempraGunslinger.put(5, 4);
        progressioneTiroSalvezzaTempraGunslinger.put(6, 5);
        progressioneTiroSalvezzaTempraGunslinger.put(7, 5);
        progressioneTiroSalvezzaTempraGunslinger.put(8, 6);
        progressioneTiroSalvezzaTempraGunslinger.put(9, 6);
        progressioneTiroSalvezzaTempraGunslinger.put(10, 7);
        progressioneTiroSalvezzaTempraGunslinger.put(11, 7);
        progressioneTiroSalvezzaTempraGunslinger.put(12, 8);
        progressioneTiroSalvezzaTempraGunslinger.put(13, 8);
        progressioneTiroSalvezzaTempraGunslinger.put(14, 9);
        progressioneTiroSalvezzaTempraGunslinger.put(15, 9);
        progressioneTiroSalvezzaTempraGunslinger.put(16, 10);
        progressioneTiroSalvezzaTempraGunslinger.put(17, 10);
        progressioneTiroSalvezzaTempraGunslinger.put(18, 11);
        progressioneTiroSalvezzaTempraGunslinger.put(19, 11);
        progressioneTiroSalvezzaTempraGunslinger.put(20, 12);
        return progressioneTiroSalvezzaTempraGunslinger;
    };
    


}
