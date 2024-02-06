import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class CharacterProgressionClass {
    
    // qui conservo le mappe di progressione dei bonus d'attacco base e dei tiri salvezza
    // idealmente ogni classe del personaggio sarà una istanza di questa classe, e avrà le sue mappe di progressione

    public static Map<Integer,Integer> progressioneBonusAttaccoBase;
    private Map<Integer,Integer> progressioneTiroSalvezzaTempra;
    private Map<Integer,Integer> progressioneTiroSalvezzaRiflessi;
    private Map<Integer,Integer> progressioneTiroSalvezzaVolonta; 

    public static Map<Integer,List<Integer>> progressioneNumeroDiAttacchi; 
    public static Integer numeroDiAttacchi;
    // numeroDiAttacchi deve essere in qualche modo governata dal livello del personaggio
    // la progressione qui sotto è corretta ma manca di un metodo che permetta di dedurre il numero di attacchi in base al livello del personaggio


    public static void settaProgressioneNumeroDiAttacchi(){
        for (Integer bonusAttaccoBase:progressioneBonusAttaccoBase.values()){
            if(bonusAttaccoBase >= 1 && bonusAttaccoBase <= 5 ){
                numeroDiAttacchi = 1;
            } else if (bonusAttaccoBase >= 6 && bonusAttaccoBase <= 10){
                numeroDiAttacchi = 2;
            } else if (bonusAttaccoBase >= 11 && bonusAttaccoBase <= 15){
                numeroDiAttacchi = 3;
            } else if (bonusAttaccoBase >= 16 && bonusAttaccoBase <= 20){
                numeroDiAttacchi = 4;
            }
        } 
    }

    public static Map<Integer,List<Integer>> progressioneTiriPerColpireGunslinger(){
        Map<Integer,List<Integer>> progressioneTiriPerColpireGunslinger = new HashMap<>();
        for (int i = 1; i <= 20; i++){
            if (i >= 1 && i <= 5){
                progressioneTiriPerColpireGunslinger.put(i, List.of(i));
            } else if (i >= 6 && i <= 10){
                progressioneTiriPerColpireGunslinger.put(i, List.of(i,i-5));
            } else if (i >= 11 && i <= 15){
                progressioneTiriPerColpireGunslinger.put(i, List.of(i,i-5,i-10));
            } else if (i >= 16 && i <= 20){
                progressioneTiriPerColpireGunslinger.put(i, List.of(i,i-5,i-10,i-15));
            }
        }
        return progressioneTiriPerColpireGunslinger;
    }

    private static void progressioneBonusAttaccoBaseGunslinger(){   
        // qui imposto la progressione del bonus d'attacco base per la classe Gunslinger
        for (int i = 1; i == 20; i++) {
            progressioneBonusAttaccoBase.put(i, i);
        }
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
