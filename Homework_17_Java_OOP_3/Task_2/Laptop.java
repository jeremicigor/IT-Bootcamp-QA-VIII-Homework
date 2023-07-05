package domaci17z2;

/*
Napraviti klasu laptop koja
nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB,
memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
 */

public class Laptop extends Racunar {
    private double screenSize;
    private Tastatura keyboard;


    public Laptop() {

    }

    public Laptop(double screenSize, Tastatura tastatura) {
        this.screenSize = screenSize;
        this.keyboard = tastatura;
    }

    public Laptop(int amountProcessors, int amountRam, int amountGB, double screenSize, Tastatura tastatura) {
        super(amountProcessors, amountRam, amountGB);
        this.screenSize = screenSize;
        this.keyboard = tastatura;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize > 0) {
            this.screenSize = screenSize;
        } else {
            System.out.println("Velicina ekrana ne moze biti negativna.");
        }
    }

    public Tastatura getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Tastatura keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return  "Broj procesora: " + amountProcessors +
                ", ram:" + amountRam +
                "GB, memorija: " + amountGB +
                "GB, ekran: " + screenSize + '"' +
                ", tastatura: " + keyboard;
    }
}
