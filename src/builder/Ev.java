package builder;

public class Ev {

    private String olke;
    private String seher;
    private String mehle;

    private int binaIli;
    private int otaqSayi;
    private int hamamSayi;
    private int tualetSayi;
    private int balkonSayi;

    private boolean esyalidirmi;
    private boolean parkingVarmi;
    private boolean usaqBaxcasiVarmi;
    private boolean kombiVarmi;

    public Ev() {
    }

    public Ev(String olke, String seher, String mehle, int binaIli,
              int otaqSayi, int hamamSayi, int tualetSayi,
              int balkonSayi, boolean esyalidirmi,
              boolean parkingVarmi, boolean usaqBaxcasiVarmi, boolean kombiVarmi) {

        this.olke = olke;
        this.seher = seher;
        this.mehle = mehle;
        this.binaIli = binaIli;
        this.otaqSayi = otaqSayi;
        this.hamamSayi = hamamSayi;
        this.tualetSayi = tualetSayi;
        this.balkonSayi = balkonSayi;
        this.esyalidirmi = esyalidirmi;
        this.parkingVarmi = parkingVarmi;
        this.usaqBaxcasiVarmi = usaqBaxcasiVarmi;
        this.kombiVarmi = kombiVarmi;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "olke='" + olke + '\'' +
                ", seher='" + seher + '\'' +
                ", mehle='" + mehle + '\'' +
                ", binaIli=" + binaIli +
                ", otaqSayi=" + otaqSayi +
                ", hamamSayi=" + hamamSayi +
                ", tualetSayi=" + tualetSayi +
                ", balkonSayi=" + balkonSayi +
                ", esyalidirmi=" + esyalidirmi +
                ", parkingVarmi=" + parkingVarmi +
                ", usaqBaxcasiVarmi=" + usaqBaxcasiVarmi +
                ", kombiVarmi=" + kombiVarmi +
                '}';
    }

    public String getOlke() {
        return olke;
    }

    public void setOlke(String olke) {
        this.olke = olke;
    }

    public String getSeher() {
        return seher;
    }

    public void setSeher(String seher) {
        this.seher = seher;
    }

    public String getMehle() {
        return mehle;
    }

    public void setMehle(String mehle) {
        this.mehle = mehle;
    }

    public int getBinaIli() {
        return binaIli;
    }

    public void setBinaIli(int binaIli) {
        this.binaIli = binaIli;
    }

    public int getOtaqSayi() {
        return otaqSayi;
    }

    public void setOtaqSayi(int otaqSayi) {
        this.otaqSayi = otaqSayi;
    }

    public int getHamamSayi() {
        return hamamSayi;
    }

    public void setHamamSayi(int hamamSayi) {
        this.hamamSayi = hamamSayi;
    }

    public int getTualetSayi() {
        return tualetSayi;
    }

    public void setTualetSayi(int tualetSayi) {
        this.tualetSayi = tualetSayi;
    }

    public int getBalkonSayi() {
        return balkonSayi;
    }

    public void setBalkonSayi(int balkonSayi) {
        this.balkonSayi = balkonSayi;
    }

    public boolean isEsyalidirmi() {
        return esyalidirmi;
    }

    public void setEsyalidirmi(boolean esyalidirmi) {
        this.esyalidirmi = esyalidirmi;
    }

    public boolean isParkingVarmi() {
        return parkingVarmi;
    }

    public void setParkingVarmi(boolean parkingVarmi) {
        this.parkingVarmi = parkingVarmi;
    }

    public boolean isUsaqBaxcasiVarmi() {
        return usaqBaxcasiVarmi;
    }

    public void setUsaqBaxcasiVarmi(boolean usaqBaxcasiVarmi) {
        this.usaqBaxcasiVarmi = usaqBaxcasiVarmi;
    }

    public boolean isKombiVarmi() {
        return kombiVarmi;
    }

    public void setKombiVarmi(boolean kombiVarmi) {
        this.kombiVarmi = kombiVarmi;
    }
}
