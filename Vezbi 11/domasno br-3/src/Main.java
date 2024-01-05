import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = List.of(
                new Student("Stefan", "Stefanovski", "105"),
                new Student("Aleksandar", "Petkovski", "106")
        );


        XmlCreator.createXml("studenti.xml", studenti);
    }
}