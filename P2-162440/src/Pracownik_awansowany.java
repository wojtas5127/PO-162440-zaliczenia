public class Pracownik_awansowany extends Pracownik {
    private double progWynagrodzenia;

    public Pracownik_awansowany(String nazwa, double wynagrodzenie_poczatkowe, int rok, int miesiac , int dzien,double progWynagrodzenia) {
        super(nazwa,wynagrodzenie_poczatkowe,rok,miesiac,dzien);
        this.progWynagrodzenia = progWynagrodzenia;


    }

    public double getProgWynagrodzenia(){
        return this.progWynagrodzenia;
    }

    public boolean awansowany(){
        double wynagrodzenie = getWynagrodzenie_poczatkowe();
        if (wynagrodzenie > progWynagrodzenia){
            return true;
        }else {
            return false;
        }
    }


}
