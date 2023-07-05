package domaci16z2;

public class Konverter {

    private Valuta valuta;
    private int dinari;

    public Konverter() {

    }

    public Konverter(Valuta valuta, int dinari) {
        this.valuta = valuta;
        if (dinari > 0) {
            this.dinari = dinari;
        } else {
            System.out.println("Unesite pozitivan iznos.");
        }
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public void setDinari(int dinari) {
        if (dinari > 0) {
            this.dinari = dinari;
        } else {
            System.out.println("Unesite pozitivan iznos.");
        }
    }

    public void convert(){
        double finalAmount;

        switch (valuta){
            case EUR:
                finalAmount = dinari/117.2797;
                System.out.println(dinari + " RSD je: " + finalAmount + " EUR");
                break;
            case USD:
                finalAmount = dinari/109.2193;
                System.out.println(dinari + " RSD je: " + finalAmount + " USD");
                break;
            case CAD:
                finalAmount = dinari/80.2351;
                System.out.println(dinari + " RSD je: " + finalAmount + " CAD");
                break;
            case RUB:
                finalAmount = dinari/1.3632;
                System.out.println(dinari + " RSD je: " + finalAmount + " RUB");
                break;
            case AUD:
                finalAmount = dinari/71.2427;
                System.out.println(dinari + " RSD je: " + finalAmount + " AUD");
                break;
            case GBP:
                finalAmount = dinari/134.7733;
                System.out.println(dinari + " RSD je: " + finalAmount + " GBP");
                break;

        }
    }

    @Override
    public String toString() {
        return "Konverter{" +
                "valuta='" + valuta + '\'' +
                ", dinari=" + dinari +
                '}';
    }

}
