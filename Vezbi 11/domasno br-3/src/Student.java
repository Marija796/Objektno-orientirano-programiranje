import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class Student {
    private String ime;
    private String prezime;
    private String index;

    public Student(String ime, String prezime, String index) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}

