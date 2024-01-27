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
    private Integer punteggioForza;
    private Integer punteggioDestrezza;
    private Integer punteggioCostituzione;
    private Integer punteggioIntelligenza;
    private Integer punteggioSaggezza;
    private Integer punteggioCarisma;

    // In questa sezione conserverò i modificatori delle caratteristiche del personaggio

    private Integer modificatoreForza = (int)Math.floor((punteggioForza - 10) / 2);
    private Integer modificatoreDestrezza = (int)Math.floor((punteggioDestrezza - 10) / 2);
    private Integer modificatoreCostituzione = (int)Math.floor((punteggioCostituzione - 10) / 2);
    private Integer modificatoreIntelligenza = (int)Math.floor((punteggioIntelligenza - 10) / 2);
    private Integer modificatoreSaggezza = (int)Math.floor((punteggioSaggezza - 10) / 2);
    private Integer modificatoreCarisma = (int)Math.floor((punteggioCarisma - 10) / 2);


    // In questa sezione conserverò i tiri salvezza del personaggio

    private Integer tiroSalvezzaTempra;
    private Integer tiroSalvezzaRiflessi;
    private Integer tiroSalvezzaVolonta;
    
    
    // In questa sezione conserverò il bonus d'attacco base del personaggio 

    private Integer bonusAttaccoBase;


    


}