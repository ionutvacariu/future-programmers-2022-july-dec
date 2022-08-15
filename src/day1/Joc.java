package day1;

public class Joc extends Produs {
    private String tipDeJoc; // RGP, FPS, RTS, JOC_DE_FETE
    static String[] posibilTipDeJoc;

    //singlePlayer/multiplayer
    private boolean multiplayer;


    static {

        posibilTipDeJoc = new String[4];
        posibilTipDeJoc[0] = "RPG";
        //....
    }

    public Joc() {
    }

    public Joc(double p) {
        pret = p;
    }


    static void modificaPTD(String nouTDJ, int pos) {
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

    public String[] getPosibilTipDeJoc() {
        return posibilTipDeJoc;
    }

    public void setPosibilTipDeJoc(String[] posibilTipDeJoc) {
        this.posibilTipDeJoc = posibilTipDeJoc;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }
}
