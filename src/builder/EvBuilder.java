package builder;

public class EvBuilder {

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

    public static EvBuilder startBuild(String olke, String seher, String mehle, int binaIli, int otaqSayi) {

        EvBuilder evBuilder = new EvBuilder();
        evBuilder.olke = olke;
        evBuilder.seher = seher;
        evBuilder.mehle = mehle;
        evBuilder.binaIli = binaIli;
        evBuilder.otaqSayi = otaqSayi;

        return new EvBuilder();

    }

    public Ev build() {
        Ev ev = new Ev();

        ev.setOlke(olke);
        ev.setSeher(seher);
        ev.setMehle(mehle);

        ev.setBinaIli(binaIli);
        ev.setOtaqSayi(otaqSayi);
        ev.setHamamSayi(hamamSayi);
        ev.setTualetSayi(tualetSayi);
        ev.setBalkonSayi(balkonSayi);

        ev.setEsyalidirmi(esyalidirmi);
        ev.setParkingVarmi(parkingVarmi);
        ev.setUsaqBaxcasiVarmi(usaqBaxcasiVarmi);
        ev.setKombiVarmi(kombiVarmi);

        return ev;
    }

    public EvBuilder setHamamSayi(int hamamSayi) {
        this.hamamSayi = hamamSayi;
        return this;

    }

    public EvBuilder setTualetSayi(int tualetSayi) {
        this.tualetSayi = tualetSayi;
        return this;

    }

    public EvBuilder setBalkonSayi(int balkonSayi) {
        this.balkonSayi = balkonSayi;
        return this;

    }

    public EvBuilder setEsyalidirmi(boolean esyalidirmi) {
        this.esyalidirmi = esyalidirmi;
        return this;

    }

    public EvBuilder setParkingVarmi(boolean parkingVarmi) {
        this.parkingVarmi = parkingVarmi;
        return this;

    }

    public EvBuilder setUsaqBaxcasiVarmi(boolean usaqBaxcasiVarmi) {
        this.usaqBaxcasiVarmi = usaqBaxcasiVarmi;
        return this;

    }

    public EvBuilder setKombiVarmi(boolean kombiVarmi) {
        this.kombiVarmi = kombiVarmi;
        return this;

    }
}
