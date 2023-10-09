import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Parinte> lista= new ArrayList<Parinte>();

        Parinte prt = new Parinte("Andrei");
        lista.add(prt);
        Parinte prt2 = new Parinte("Maria");
        lista.add(prt2);
        Copil cpl = new Copil("Ion");
        lista.add(cpl);
        Copil cpl2 = new Copil("Vasile");
        lista.add(cpl2);
        Copil cpl3 = new Copil("Gheorghe");
        lista.add(cpl3);

        Collections.sort(lista, (o1, o2) -> o1.nume.compareToIgnoreCase(o2.nume));

        for (Parinte p: lista) {
            p.afiseaza();
        }
    }
}