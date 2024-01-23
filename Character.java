public interface Character {

    Integer getPunteggioForza();
    Integer getPunteggioDestrezza();
    Integer getPunteggioCostituzione();
    Integer getPunteggioIntelligenza();
    Integer getPunteggioSaggezza();
    Integer getPunteggioCarisma();

    // Definisci i metodi per calcolare i modificatori
    default Integer modificatoreForza(){
        return (getPunteggioForza() - 10) / 2;
    }

    default Integer modificatoreDestrezza(){
        return (getPunteggioDestrezza() - 10) / 2;
    }

    default Integer modificatoreCostituzione(){
        return (getPunteggioCostituzione() - 10) / 2;
    }

    default Integer modificatoreIntelligenza(){
        return (getPunteggioIntelligenza() - 10) / 2;
    }

    default Integer modificatoreSaggezza(){
        return (getPunteggioSaggezza() - 10) / 2;
    }

    default Integer modificatoreCarisma(){
        return (getPunteggioCarisma() - 10) / 2;
    }

    
}