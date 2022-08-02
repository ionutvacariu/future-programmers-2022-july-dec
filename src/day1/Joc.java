package day1;

public class Joc {
    private String numeJoc;
    private double pret;
    // Replace "String" with Date
    private String date; //ex "2022/03/04"
    private String tipDeJoc; // RGP, FPS, RTS, JOC_DE_FETE
    static String[] posibilTipDeJoc;

    static {

        posibilTipDeJoc = new String[4];
        posibilTipDeJoc[0] = "RPG";
        //....
    }

    ;

    static void  modificaPTD(String nouTDJ, int pos) {
        posibilTipDeJoc[pos] = nouTDJ;
    }

    void setTipDeJoc(String tdjParam) {
        for (String tdjiterator : posibilTipDeJoc) {
            if (tdjParam.equals(tdjiterator)) {
                tipDeJoc = tdjParam;
            }
        }
    }

    String getTipDeJoc() {
        return tipDeJoc;
    }

    public String getNumeJoc() {
        return numeJoc;
    }

    public void setNumeJoc(String numeJoc) {
        this.numeJoc = numeJoc;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getPosibilTipDeJoc() {
        return posibilTipDeJoc;
    }

    public void setPosibilTipDeJoc(String[] posibilTipDeJoc) {
        this.posibilTipDeJoc = posibilTipDeJoc;
    }
}
