import java.util.ArrayList;
import java.util.List;

public class Carte{
    public List<Pagina> pagini = new ArrayList<Pagina>();
    public String titlu;
    public String autor;

    public Carte(){
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void addPages(Pagina p){
        pagini.add(p);
    }
}
