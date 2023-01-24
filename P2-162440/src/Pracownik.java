import java.time.LocalDate;

public class Pracownik {
    private String nazwa;
    private double wynagrodzenie_poczatkowe;
    private LocalDate dataZatrudnienia;
    private int rok;
    private int miesiac;
    private  int dzien;

    public Pracownik(String nazwa, double wynagrodzenie_poczatkowe, int rok, int miesiac , int dzien){
        this.nazwa = nazwa;
        this.wynagrodzenie_poczatkowe = wynagrodzenie_poczatkowe;
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;

    }


    public String getNazwa(){
        return this.nazwa;
    }

    public double getWynagrodzenie_poczatkowe(){
        return this.wynagrodzenie_poczatkowe;
    }

    public void setDataZatrudnienia(int x, int y, int z){
        this.dataZatrudnienia = LocalDate.of(x,y,z);
    }

    @Override
    public String toString(){
        return getClass().getName() + " [" + this.nazwa + ", " + this.wynagrodzenie_poczatkowe + ", " + this.rok+
                "."+this.miesiac+"."+ this.dzien+ "]";
    }

    public boolean equals(Pracownik obj){
        return this.nazwa.equals(obj) && this.wynagrodzenie_poczatkowe == obj.wynagrodzenie_poczatkowe &&
                this.rok == obj.rok && this.miesiac == obj.miesiac && this.dzien == obj.dzien;

    }




}
