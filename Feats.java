import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
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

    public static List<Integer> tiroPerColpire(Integer numeroDiAttacchi){
        //TODO implementa la logica del colpo critico
        List<Integer> tiriPerColpire = new ArrayList<Integer>();
        for (int i = 0; i < numeroDiAttacchi; i++) {
            tiriPerColpire.add((int)Math.floor(Math.random() *(20 - 1 + 1) + 1));
        }
        return tiriPerColpire;
    }

    public static List<Integer> calcoloDeiDanni(List<Integer> tiriPerColpire){
        //TODO raffina la logica del danno per colpo critico
        List<Integer> danni = new ArrayList<Integer>();
        for (Integer tiroPerColpire : tiriPerColpire) {
            if (tiroPerColpire == 20) {
                danni.add((int)Math.floor(Math.random() *(8 - 1 + 1) + 1) * 4);
            } else {
                danni.add((int)Math.floor(Math.random() *(8 - 1 + 1) + 1));
            }
        }
        return danni;
    }

    //Combiniamo il tiro per colpire con il danno



}   

