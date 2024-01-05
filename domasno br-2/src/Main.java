import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesete tekst i pritisnete Enter:");


        String tekst = scanner.nextLine();


        System.out.println("Vasiot tekst e: " + tekst);


        scanner.close();
    }
}
