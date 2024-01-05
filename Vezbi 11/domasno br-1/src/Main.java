public class Main {
    public static void main(String[] args) {
        Datoteka datoteka = new Datoteka("test.txt");
        datoteka.zapisiVoFajl("Zapisuvanje na tekst vo fajl.");
        datoteka.citajOdFajl();
    }
}