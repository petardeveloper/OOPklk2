package vezba1;

public class Laptop {
    // Privatni atributi
    private String proizvodjac;
    private String model;
    private int godinaProizvodnje;
    private int kolicinaMemorije;
    private int velicinaDiska;
    private GrafickaKartica grafickaKartica;

    // Prvi konstruktor
    public Laptop(String proizvodjac, String model, int godinaProizvodnje, int kolicinaMemorije, int velicinaDiska, GrafickaKartica grafickaKartica) {
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kolicinaMemorije = kolicinaMemorije;
        this.velicinaDiska = velicinaDiska;
        this.grafickaKartica = grafickaKartica;
    }

    // Drugi konstruktor
    public Laptop(String proizvodjac, String model, int godinaProizvodnje, int kolicinaMemorije, int velicinaDiska, int radnaFrekvencijaProcesora, int brojJezgara, int sirinaMagistrale, int kolicinaMemorijeGraficke) {
        this(proizvodjac, model, godinaProizvodnje, kolicinaMemorije, velicinaDiska, new GrafickaKartica(radnaFrekvencijaProcesora, brojJezgara, sirinaMagistrale, kolicinaMemorijeGraficke));
    }

    // Getteri i setteri
    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getKolicinaMemorije() {
        return kolicinaMemorije;
    }

    public void setKolicinaMemorije(int kolicinaMemorije) {
        this.kolicinaMemorije = kolicinaMemorije;
    }

    public int getVelicinaDiska() {
        return velicinaDiska;
    }

    public void setVelicinaDiska(int velicinaDiska) {
        this.velicinaDiska = velicinaDiska;
    }

    public GrafickaKartica getGrafickaKartica() {
        return grafickaKartica;
    }

    public void setGrafickaKartica(GrafickaKartica grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }
    
    // Metod toString
    @Override
    public String toString() {
        return "(" + proizvodjac + ", " + model + ", " + godinaProizvodnje + ", " + kolicinaMemorije + ", " + velicinaDiska + ", " + grafickaKartica + ")";
    }
}
