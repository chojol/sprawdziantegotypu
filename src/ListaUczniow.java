import java.util.ArrayList;
import java.util.List;

public class ListaUczniow {
    private List<Uczen> listaUczniow;

    public ListaUczniow() {
        listaUczniow = new ArrayList<>();
    }

    public void dodajUcznia(String imie, String nazwisko) {
        int id = listaUczniow.size() + 1;
    }

    public void wyswietl() {
        System.out.println("lista uczniow: ");
        for (Uczen uczen : listaUczniow) {
            System.out.println(uczen);
        }
    }
    public void usun(String imie, String nazwisko){
        List<Uczen> Usuwanko = new ArrayList<>();
        for (Uczen uczen : listaUczniow){
            if (uczen.getImie().equals(imie) && uczen.getNazwisko().equals(nazwisko)){
                Usuwanko.add(uczen);
            }
        }
        listaUczniow.removeAll(Usuwanko);
    }
}
