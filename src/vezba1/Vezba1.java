package vezba1;

import java.util.Scanner;

public class Vezba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Unos broja laptopova od korisnika
        System.out.println("Unesite broj laptopova:");
        int brojLaptopova = scanner.nextInt();

        // Kreiranje niza laptopova
        Laptop[] laptopi = new Laptop[brojLaptopova];

        // Petlja za unos podataka za svaki laptop
        for (int i = 0; i < brojLaptopova; i++) {
            System.out.println("Unesite podatke za laptop #" + (i + 1) + ":");
            System.out.print("Proizvođač: ");
            String proizvodjac = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Godina proizvodnje: ");
            int godinaProizvodnje = scanner.nextInt();
            System.out.print("Količina memorije: ");
            int kolicinaMemorije = scanner.nextInt();
            System.out.print("Veličina diska: ");
            int velicinaDiska = scanner.nextInt();

            // Unos podataka za graficku karticu
            System.out.println("Unesite podatke za graficku karticu laptopa #" + (i + 1) + ":");
            System.out.print("Radna frekvencija procesora: ");
            int radnaFrekvencijaProcesora = scanner.nextInt();
            System.out.print("Broj jezgara: ");
            int brojJezgara = scanner.nextInt();
            System.out.print("Širina magistrale: ");
            int sirinaMagistrale = scanner.nextInt();
            System.out.print("Količina memorije graficke kartice: ");
            int kolicinaMemorijeGraficke = scanner.nextInt();

            // Kreiranje objekta klase GrafickaKartica
            GrafickaKartica grafickaKartica = new GrafickaKartica(radnaFrekvencijaProcesora, brojJezgara, sirinaMagistrale, kolicinaMemorijeGraficke);

            // Kreiranje objekta klase Laptop i dodavanje u niz na odgovarajucu poziciju
            laptopi[i] = new Laptop(proizvodjac, model, godinaProizvodnje, kolicinaMemorije, velicinaDiska, grafickaKartica);
        }

        // Ispisivanje informacija o laptopovima koji ispunjavaju uslove
        for (int i = 0; i < brojLaptopova; i++) {
            if (laptopi[i].getKolicinaMemorije() > 8 && laptopi[i].getGrafickaKartica().getBrojJezgara() > 1) {
                System.out.println("Laptop #" + (i + 1) + ": " + laptopi[i].toString());
            }
        }
    }
}
