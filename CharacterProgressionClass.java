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

    public static Map<Integer,Integer> progressioneTiroSalvezzaRiflessiGunslinger(){
        Map<Integer,Integer> progressioneTiroSalvezzaRiflessiGunslinger = new HashMap<>();
        progressioneTiroSalvezzaRiflessiGunslinger.put(1, 2);
        progressioneTiroSalvezzaRiflessiGunslinger.put(2, 3);
        progressioneTiroSalvezzaRiflessiGunslinger.put(3, 3);
        progressioneTiroSalvezzaRiflessiGunslinger.put(4, 4);
        progressioneTiroSalvezzaRiflessiGunslinger.put(5, 4);
        progressioneTiroSalvezzaRiflessiGunslinger.put(6, 5);
        progressioneTiroSalvezzaRiflessiGunslinger.put(7, 5);
        progressioneTiroSalvezzaRiflessiGunslinger.put(8, 6);
        progressioneTiroSalvezzaRiflessiGunslinger.put(9, 6);
        progressioneTiroSalvezzaRiflessiGunslinger.put(10, 7);
        progressioneTiroSalvezzaRiflessiGunslinger.put(11, 7);
        progressioneTiroSalvezzaRiflessiGunslinger.put(12, 8);
        progressioneTiroSalvezzaRiflessiGunslinger.put(13, 8);
        progressioneTiroSalvezzaRiflessiGunslinger.put(14, 9);
        progressioneTiroSalvezzaRiflessiGunslinger.put(15, 9);
        progressioneTiroSalvezzaRiflessiGunslinger.put(16, 10);
        progressioneTiroSalvezzaRiflessiGunslinger.put(17, 10);
        progressioneTiroSalvezzaRiflessiGunslinger.put(18, 11);
        progressioneTiroSalvezzaRiflessiGunslinger.put(19, 11);
        progressioneTiroSalvezzaRiflessiGunslinger.put(20, 12);
        return progressioneTiroSalvezzaRiflessiGunslinger;
    }

    public static Map<Integer,Integer> progressioneTiroSalvezzaVolontaGunslinger(){
        Map<Integer,Integer> progressioneTiroSalvezzaVolontaGunslinger = new HashMap<>();
        progressioneTiroSalvezzaVolontaGunslinger.put(1, 0);
        progressioneTiroSalvezzaVolontaGunslinger.put(2,0);
        progressioneTiroSalvezzaVolontaGunslinger.put(3, 1);
        progressioneTiroSalvezzaVolontaGunslinger.put(4, 1);
        progressioneTiroSalvezzaVolontaGunslinger.put(5, 1);
        progressioneTiroSalvezzaVolontaGunslinger.put(6, 2);
        progressioneTiroSalvezzaVolontaGunslinger.put(7, 2);
        progressioneTiroSalvezzaVolontaGunslinger.put(8, 2);
        progressioneTiroSalvezzaVolontaGunslinger.put(9, 3);
        progressioneTiroSalvezzaVolontaGunslinger.put(10, 3);
        progressioneTiroSalvezzaVolontaGunslinger.put(11, 3);
        progressioneTiroSalvezzaVolontaGunslinger.put(12, 4);
        progressioneTiroSalvezzaVolontaGunslinger.put(13, 4);
        progressioneTiroSalvezzaVolontaGunslinger.put(14, 4);
        progressioneTiroSalvezzaVolontaGunslinger.put(15, 5);
        progressioneTiroSalvezzaVolontaGunslinger.put(16, 5);
        progressioneTiroSalvezzaVolontaGunslinger.put(17, 5);
        progressioneTiroSalvezzaVolontaGunslinger.put(18, 6);
        progressioneTiroSalvezzaVolontaGunslinger.put(19, 6);
        progressioneTiroSalvezzaVolontaGunslinger.put(20, 6);
        return progressioneTiroSalvezzaVolontaGunslinger;
    }



}
