
public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int tilfældeIAlt;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int tilfældeIAlt, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilfældeIAlt = tilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getTilfældeIAlt() {
        return tilfældeIAlt;

    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtePåIntensiv() {
        return indlagtePåIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }
}

