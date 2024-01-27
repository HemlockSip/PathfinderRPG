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

    public static void tiroRapido(Integer numeroDiAttacchi) {
        //aggiungi un tiro per colpire con l'arco o balestra, ma subisci -2 al tiro per colpire
        //TODO applicare il malus al tiro per colpire
        numeroDiAttacchi += 1;
    }

    public static List<Integer> tiroPerColpire(Integer numeroDiAttacchi,Boolean tiroLetale){
        //TODO implementa la logica del colpo critico
        List<Integer> tiriPerColpire = new ArrayList<Integer>();
        for (int i = 0; i < numeroDiAttacchi; i++) {
            if (tiroLetale == true) {
                tiriPerColpire.add((int)Math.floor(Math.random() *(20 - 1 + 1) + 1) - 4);
            } else if (tiroLetale == false) {
                tiriPerColpire.add((int)Math.floor(Math.random() *(20 - 1 + 1) + 1));
                
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
                danni.add((int)Math.floor(Math.random() *(8 - 1 + 1) + modificatoreMagicoArma) + modificatoreTiroLetale * moltiplicatoreDannoCritico);
            } else {
                danni.add((int)Math.floor(Math.random() *(8 - 1 + 1) + modificatoreMagicoArma) + modificatoreTiroLetale);
            }
        }
        return danni;
    }

    // qui invece imposto Tiro Letale, che è un feat che permette di fare un tiro per colpire con un malus di -4, ma se colpisci fai il doppio dei danni
    public static boolean tiroLetale(String decisione){
        if (decisione == "si") {
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
