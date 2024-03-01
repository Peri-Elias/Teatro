public class Teatro {
    //attributi

    private String nome;
    private int platea;
    private int palco;
    private int prenotatiPa;
    private int prenotatiPl;
    //metodi
    public Teatro(String nome, int platea,int palco, int prenotatiPa,int prenotatiPl){
        this.nome = nome;
        this.platea = platea;
        this.palco = palco;
        this.prenotatiPa = prenotatiPa;
        this.prenotatiPl = prenotatiPl;
    }//constructor

    public String toString(){
        return "nome:" +nome+
                "\nplatea:" +platea+
                "\nPrenotati:" +prenotatiPl+
                "\npalco:" +palco+
                "\nPrenotati:" +prenotatiPa;
    }//toString

    public int liberiPlatea(){
        return platea - prenotatiPl;
    }
    public int liberiPalco(){
        return palco - prenotatiPa;
    }
    private boolean postiPalco(int quantitativo){
        prenotatiPa += quantitativo;
        if(palco < prenotatiPa){
            return false;
        }
        this.prenotatiPa = prenotatiPa;
        return true;
    }//posti
    private boolean postiPlatea(int quantitativo){

        if(platea < (prenotatiPl + quantitativo)){
            return false;
        }
        this.prenotatiPl = this.prenotatiPl + quantitativo;
        return true;
    }//posti

    public boolean prenotazioni(int quantita, String scelta){
        if ("platea".equals(scelta)){
            return postiPlatea(quantita);
        } else if("palco".equals(scelta)) {
            return postiPalco(quantita);
        }
        return false;
    }//prenotazioni
}



