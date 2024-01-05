import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class XmlCreator {
    public static void createXml(String filename, List<Student> studenti) {
        try (FileWriter writer = new FileWriter(filename)) {

            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<Studenti>\n");


            for (int i = 0; i < studenti.size(); i++) {
                Student student = studenti.get(i);
                writer.write("\t<Student id=\"" + i + "\">\n");
                writer.write("\t\t<Ime>" + student.getIme() + "</Ime>\n");
                writer.write("\t\t<Prezime>" + student.getPrezime() + "</Prezime>\n");
                writer.write("\t\t<Index>" + student.getIndex() + "</Index>\n");
                writer.write("\t</Student>\n");
            }


            writer.write("</Studenti>\n");

            System.out.println("XML dokumentot e uspesno kreiran.");
        } catch (IOException e) {
            System.err.println("Greska pri kreiranje: " + e.getMessage());
        }
    }
}

