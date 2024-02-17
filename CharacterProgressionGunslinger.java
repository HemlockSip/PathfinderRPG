import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterProgressionGunslinger implements CharacterProgression {

    
    public static Map<Integer,List<Integer>> progressioneBonusAttaccoBase(){
        Map<Integer,List<Integer>> progressioneBonusAttaccoBaseGunslinger = new HashMap<>();
        for (int i = 1; i <= 20; i++){
            if (i >= 1 && i <= 5){
                progressioneBonusAttaccoBaseGunslinger.put(i, List.of(i));
            } else if (i >= 6 && i <= 10){
                progressioneBonusAttaccoBaseGunslinger.put(i, List.of(i,i-5));
            } else if (i >= 11 && i <= 15){
                progressioneBonusAttaccoBaseGunslinger.put(i, List.of(i,i-5,i-10));
            } else if (i >= 16 && i <= 20){
                progressioneBonusAttaccoBaseGunslinger.put(i, List.of(i,i-5,i-10,i-15));
            }
        }
        return progressioneBonusAttaccoBaseGunslinger;
    }

    public static Map<Integer,Integer> progressioneTiroSalvezzaTempra(){
        Map<Integer,Integer> progressioneTiroSalvezzaTempra = new HashMap<>();
        progressioneTiroSalvezzaTempra.put(1, 2);
        progressioneTiroSalvezzaTempra.put(2, 3);
        progressioneTiroSalvezzaTempra.put(3, 3);
        progressioneTiroSalvezzaTempra.put(4, 4);
        progressioneTiroSalvezzaTempra.put(5, 4);
        progressioneTiroSalvezzaTempra.put(6, 5);
        progressioneTiroSalvezzaTempra.put(7, 5);
        progressioneTiroSalvezzaTempra.put(8, 6);
        progressioneTiroSalvezzaTempra.put(9, 6);
        progressioneTiroSalvezzaTempra.put(10, 7);
        progressioneTiroSalvezzaTempra.put(11, 7);
        progressioneTiroSalvezzaTempra.put(12, 8);
        progressioneTiroSalvezzaTempra.put(13, 8);
        progressioneTiroSalvezzaTempra.put(14, 9);
        progressioneTiroSalvezzaTempra.put(15, 9);
        progressioneTiroSalvezzaTempra.put(16, 10);
        progressioneTiroSalvezzaTempra.put(17, 10);
        progressioneTiroSalvezzaTempra.put(18, 11);
        progressioneTiroSalvezzaTempra.put(19, 11);
        progressioneTiroSalvezzaTempra.put(20, 12);
        return progressioneTiroSalvezzaTempra;
    };

    public static Map<Integer,Integer> progressioneTiroSalvezzaRiflessi(){
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

    public static Map<Integer,Integer> progressioneTiroSalvezzaVolonta(){
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
