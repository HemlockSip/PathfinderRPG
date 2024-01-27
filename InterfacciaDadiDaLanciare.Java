public interface InterfacciaDadiDaLanciare {
    
    public static Integer lancioDelDado(Integer numeroFacce){
        Random rand = new Random();
        // Il dado ha valori da 1 a numeroFacce
        int roll = rand.nextInt(numeroFacce) + 1;
        return roll;
    }    

}