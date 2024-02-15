import java.util.Map;

public class Character {


    // Qui consrviamo il nome del personaggio

    private String nomePersonaggio;

    // Qui conserviamo la razza del personaggio

    private String razzaPersonaggio;

    // Qui conserviamo la classe del personaggio

    private String classePersonaggio;

    // Qui conserviamo il livello del personaggio  

    private Integer livelloPersonaggio;

    // In questa sezione conserverò le caratteristiche del personaggio
    private static Integer punteggioForza;
    private static Integer punteggioDestrezza;
    private static Integer punteggioCostituzione;
    private static Integer punteggioIntelligenza;
    private static Integer punteggioSaggezza;
    private static Integer punteggioCarisma;

    public static Integer getPunteggioForza() {
        return punteggioForza;
    }

    public static void setPunteggioForza(Integer punteggioForza) {
        Character.punteggioForza = punteggioForza;
    }

    public static Integer getPunteggioDestrezza() {
        return punteggioDestrezza;
    }

    public static void setPunteggioDestrezza(Integer punteggioDestrezza) {
        Character.punteggioDestrezza = punteggioDestrezza;
    }

    public static Integer getPunteggioCostituzione() {
        return punteggioCostituzione;
    }

    public static void setPunteggioCostituzione(Integer punteggioCostituzione) {
        Character.punteggioCostituzione = punteggioCostituzione;
    }

    public static Integer getPunteggioIntelligenza() {
        return punteggioIntelligenza;
    }

    public static void setPunteggioIntelligenza(Integer punteggioIntelligenza) {
        Character.punteggioIntelligenza = punteggioIntelligenza;
    }

    public static Integer getPunteggioSaggezza() {
        return punteggioSaggezza;
    }

    public static void setPunteggioSaggezza(Integer punteggioSaggezza) {
        Character.punteggioSaggezza = punteggioSaggezza;
    }

    public static Integer getPunteggioCarisma() {
        return punteggioCarisma;
    }

    public static void setPunteggioCarisma(Integer punteggioCarisma) {
        Character.punteggioCarisma = punteggioCarisma;
    }



    // In questa sezione conserverò i modificatori delle caratteristiche del personaggio

    private static Integer modificatoreForza = (int)Math.floor((getPunteggioForza() - 10) / 2);
    private static Integer modificatoreDestrezza = (int)Math.floor((getPunteggioDestrezza() - 10) / 2);
    private static Integer modificatoreCostituzione = (int)Math.floor((getPunteggioCostituzione() - 10) / 2);
    private static Integer modificatoreIntelligenza = (int)Math.floor((getPunteggioIntelligenza() - 10) / 2);
    private static Integer modificatoreSaggezza = (int)Math.floor((getPunteggioSaggezza() - 10) / 2);
    private static Integer modificatoreCarisma = (int)Math.floor((getPunteggioCarisma() - 10) / 2);

    // qui di seguito i getters dei modificatori delle caratteristiche

    //public static Integer getModificatoreForza() {
    //    return modificatoreForza;
    //}

    public static Integer getModificatoreDestrezza() {
        return modificatoreDestrezza;
    }

    public static Integer getModificatoreCostituzione() {
        return modificatoreCostituzione;
    }

    public static Integer getModificatoreIntelligenza() {
        return modificatoreIntelligenza;
    }

    public static Integer getModificatoreSaggezza() {
        return modificatoreSaggezza;
    }

    public static Integer getModificatoreCarisma() {
        return modificatoreCarisma;
    }

    // In questa sezione conserverò i tiri salvezza del personaggio

    private static Integer tiroSalvezzaTempra;
    private static Integer tiroSalvezzaRiflessi;
    private static Integer tiroSalvezzaVolonta;


    public static Integer calcoloTiroSalvezzaTermpra(Integer livelloPersonaggio){
         return Character.tiroSalvezzaTempra = DadiDaLanciare.lancioDelDadoDaVenti() + CharacterProgressionClass.progressioneTiroSalvezzaTempra.get(livelloPersonaggio) + getModificatoreCostituzione();
    }

    
    
    // In questa sezione conserverò il bonus d'attacco base del personaggio 

    private Integer bonusAttaccoBase;


    


}