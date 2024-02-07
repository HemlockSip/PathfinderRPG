import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Feats {

    //tiro preciso, se sei entro 9 metri dal bersaglio, ottieni +1 al tiro per colpire

    public static Integer tiroPreciso(Double distanzaBersaglio, Integer tiroPerColpire) {
        if (distanzaBersaglio <= 9) {
            tiroPerColpire += 1;
            return tiroPerColpire;
        } else {
            return tiroPerColpire;
        }

    }

    public static void tiroRapido(List<Integer> tiriPerColpire) {
        //aggiungi un tiro per colpire con l'arco o balestra, ma subisci -2 al tiro per colpire
        //TODO applicare il malus al tiro per colpire
        //idealmente il metodo deve accettare come argomento la lista del numero di tiri per colpire e il tiro per colpire stesso
        tiriPerColpire.add(null); //bisogna aggiungere il tiro per colpire più alto che il personaggio può fare
    }

    public static List<Integer> tiroPerColpire(Integer numeroDiAttacchi,Boolean tiroLetale){
        //TODO implementa la logica del colpo critico
        List<Integer> tiriPerColpire = new ArrayList<Integer>();
        for (int i = 0; i < numeroDiAttacchi; i++) {
            if (tiroLetale == true) {
                tiriPerColpire.add(DadiDaLanciare.lancioDelDadoDaVenti() - 4);
            } else if (tiroLetale == false) {
                tiriPerColpire.add(DadiDaLanciare.lancioDelDadoDaVenti() + 1);
                
            }
        }
        return tiriPerColpire;
    }

    public static List<Integer> calcoloDeiDanni(List<Integer> tiriPerColpire,Boolean tiroLetale){
        //TODO raffina la logica del danno per colpo critico
        List<Integer> danni = new ArrayList<Integer>();
        Integer modificatoreTiroLetale = 8;
        Integer moltiplicatoreDannoCritico = 4;
        Integer modificatoreMagicoArma = 1;
        for (Integer tiroPerColpire : tiriPerColpire) {
            if (tiroPerColpire == 20) {
                danni.add(DadiDaLanciare.lancioDelDadoDaOtto() + modificatoreMagicoArma + modificatoreTiroLetale * moltiplicatoreDannoCritico);
            } else {
                danni.add(DadiDaLanciare.lancioDelDadoDaOtto() + modificatoreMagicoArma + modificatoreTiroLetale);
            }
        }
        return danni;
    }

    // qui invece imposto Tiro Letale, che è un feat che permette di fare un tiro per colpire con un malus di -4, ma se colpisci fai il doppio dei danni
    public static boolean tiroLetale(String decisioneTiroLetale){
        Integer malusTxCTiroLetale = 4;
        Integer bonusDannoTiroLetale = 8;
        if (decisioneTiroLetale == "si") {
            return true;
        } else {
            return false;
        }
    }

    // ora provo ad aggiungere la gesta Mira Focalizzata, che permette di aggiungere il modificatore di carisma ai danni di tutti gli attacchi
    public static Integer miraFocalizzata(Integer modificatoreCarisma, Integer danni){
        danni += modificatoreCarisma;
        return danni;
    }

    // ora invece provo a creare una funzione che mi permetta di simulare il lancio di un dado da 4 facce (d4)

    
}
