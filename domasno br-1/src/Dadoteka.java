import java.io.*;
class Datoteka {
    private String imeNaFajl;
    private FileInputStream vlezenStrim;
    private FileOutputStream izlezenStrim;

    public Datoteka(String imeNaFajl) {
        this.imeNaFajl = imeNaFajl;
    }

    public void zapisiVoFajl(String tekst) {
        try {
            izlezenStrim = new FileOutputStream(imeNaFajl);
            izlezenStrim.write(tekst.getBytes());
            System.out.println("Podatocite se uspesno zapisani vo fajlot.");
        } catch (IOException e) {
            System.out.println("Greska pri zapisuvanje vo fajl" + e.getMessage());
        } finally {
            try {
                if (vlezenStrim != null) {
                    izlezenStrim.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void citajOdFajl() {
        try {
            vlezenStrim = new FileInputStream(imeNaFajl);
            int karakter;
            while ((karakter = vlezenStrim.read()) != -1) {
                System.out.print((char) karakter);
            }
            System.out.println("\nPodatocite se uspesno procitani od fajl.");
        } catch (IOException e) {
            System.out.println("Greska pri citanje od fajl " + e.getMessage());
        } finally {
            try {
                if (vlezenStrim != null) {
                    vlezenStrim.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
