import java.time.LocalDate;

public class Publikacja {

    private String tytul;
    private Double cena;
    private LocalDate dataWydania;
    private static int ile=0;

    class Publikacja(String tytul,Double cena,int rok,int dzien,int miesiac){
        this.tytul=tytul;
        this.cena=cena;
        this.ile=ile+1;

    }





}
