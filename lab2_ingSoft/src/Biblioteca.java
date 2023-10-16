import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    public List<Carte> carti = new ArrayList<Carte>();
    public List<Rezultat> rezultate = new ArrayList<Rezultat>();

    public Biblioteca() {

    }

    public void adaugaCarte(Carte x) {
        carti.add(x);
    }

    public void afisBibl() {
        System.out.println(carti);
    }

    public void biblSort() {
        Comparator<Carte> comparatorForSorting = Comparator.comparing(Carte::getAutor).thenComparing(Carte::getTitlu);
        Collections.sort(carti, comparatorForSorting);
    }

    public List<Rezultat> cautFraza(String phrase) {
        for (Carte x : carti) {
            for (Pagina p : x.pagini) {
                if (p.text.contains(phrase)) {
                    Rezultat r = new Rezultat(x.titlu,p.nrPag);
                    rezultate.add(r);
                }
            }
        }
        return rezultate;
    }

    public void afisPagina(String title, int page) {
        for (Carte x : carti)
            if (x.titlu == title)
                for (Pagina p : x.pagini)
                    if (p.nrPag == page)
                        System.out.println(p.text);
    }
}
