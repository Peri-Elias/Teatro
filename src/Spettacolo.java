public class Spettacolo extends Teatro{
    //attributi
    private String nominativo;
    private String dtn;
    private int repliche;
    //metodi
    public Spettacolo(String nome, int platea,int palco, int prenotatiPa,int prenotatiPl, String nominativo, String dtn, int repliche){
        super(nome, platea, palco, prenotatiPa, prenotatiPl);
        this.nominativo = nominativo;
        this.dtn = dtn;
        this.repliche = repliche;
    }//constructor

    

}
