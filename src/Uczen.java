public class Uczen {
    public int id;
    public String imie;
    public String nazwisko;

    public Uczen(int id,String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Uczen(Uczen kopia){
        this.id = kopia.id;
        this.imie = kopia.imie;
        this.nazwisko = kopia.nazwisko;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
}

