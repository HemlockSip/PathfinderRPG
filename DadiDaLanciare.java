import java.util.Random;

public class DadiDaLanciare{

    public static Integer lancioDelDado(Integer numeroFacce){
        Random rand = new Random();
        // Il dado ha valori da 1 a numeroFacce
        int roll = rand.nextInt(numeroFacce) + 1;
        return roll;
    }    

    public static Integer lancioDelDadoDaQuattro(){
        Integer risultatoDelDadoDaQuattro = lancioDelDado(4);
        return risultatoDelDadoDaQuattro;
    }
    
    public static Integer lancioDelDadoDaOtto(){
        Integer risultatoDelDadoDaOtto = lancioDelDado(8);
        return risultatoDelDadoDaOtto;
    }

    public static Integer lancioDelDadoDaDieci(){
        Integer risultatoDelDadoDaDieci = lancioDelDado(10);
        return risultatoDelDadoDaDieci;
    }

    public static Integer lancioDelDadoDaDodici(){
        Integer risultatoDelDadoDaDodici = lancioDelDado(12);
        return risultatoDelDadoDaDodici;
    }

    public static Integer lancioDelDadoDaVenti(){
        Integer risultatoDelDadoDaVenti = lancioDelDado(20);
        return risultatoDelDadoDaVenti;
    }

    public static Integer lancioDelDadoPercentuale(){
        Integer risultatoDelDadoPercentuale = 0;
        //a grandi linee la logica dovrebbe essere questa: se il tiro delle decine va da 1 a 9, allora queste corrispondono effettivamente alle decine e bisogna sommare il tiro delle unità
        //se il tiro delle decine è 10, allora bisogna verificare anche il secondo tiro delle unità
        //se il tiro delle unità va da 1 a 9, allora queste corrispondono effettivamente alle unità
        //se il tiro delle unità è 10, allora succedono due cose. Se il tiro delle decine è 10, allora il tiro percentuale è 100. Se il tiro delle decine è da 1 a 9, allora il tiro percentuale è 0.
        
        Integer tiroDelleDecine = lancioDelDadoDaDieci();
        Integer tiroDelleUnita = lancioDelDadoDaDieci();

        if (tiroDelleDecine < 10) {
            if (tiroDelleUnita <10 ){
                risultatoDelDadoPercentuale = tiroDelleDecine * 10 + tiroDelleUnita;
                return risultatoDelDadoPercentuale;
            } else if (tiroDelleUnita == 10) {
                risultatoDelDadoPercentuale = tiroDelleDecine * 10 + 0;
                return risultatoDelDadoPercentuale;
            }
        } else if (tiroDelleDecine == 10) {
            if (tiroDelleUnita == 10) {
                risultatoDelDadoPercentuale = 100;
                return risultatoDelDadoPercentuale;
            } else if (tiroDelleUnita < 10) {
                risultatoDelDadoPercentuale = 0 + tiroDelleUnita;
                return risultatoDelDadoPercentuale;
            }
        }
        
        
        return risultatoDelDadoPercentuale;
    }

}