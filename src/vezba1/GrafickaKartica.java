package vezba1;

public class GrafickaKartica {
    // Privatni atributi
    private int radnaFrekvencijaProcesora;
    private int brojJezgara;
    private int sirinaMagistrale;
    private int kolicinaMemorije;

    // Konstruktor
    public GrafickaKartica(int radnaFrekvencijaProcesora, int brojJezgara, int sirinaMagistrale, int kolicinaMemorije) {
        this.radnaFrekvencijaProcesora = radnaFrekvencijaProcesora;
        this.brojJezgara = brojJezgara;
        this.sirinaMagistrale = sirinaMagistrale;
        this.kolicinaMemorije = kolicinaMemorije;
    }

    // Getteri i setteri
    public int getRadnaFrekvencijaProcesora() {
        return radnaFrekvencijaProcesora;
    }

    public void setRadnaFrekvencijaProcesora(int radnaFrekvencijaProcesora) {
        this.radnaFrekvencijaProcesora = radnaFrekvencijaProcesora;
    }

    public int getBrojJezgara() {
        return brojJezgara;
    }

    public void setBrojJezgara(int brojJezgara) {
        this.brojJezgara = brojJezgara;
    }

    public int getSirinaMagistrale() {
        return sirinaMagistrale;
    }

    public void setSirinaMagistrale(int sirinaMagistrale) {
        this.sirinaMagistrale = sirinaMagistrale;
    }

    public int getKolicinaMemorije() {
        return kolicinaMemorije;
    }

    public void setKolicinaMemorije(int kolicinaMemorije) {
        this.kolicinaMemorije = kolicinaMemorije;
    }
}
