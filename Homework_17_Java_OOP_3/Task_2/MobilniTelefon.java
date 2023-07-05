package domaci17z2;

/*
Napraviti klasu mobilni telefon koji nasleđuje računar i
ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G). Implementirati
toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G"
 */

public class MobilniTelefon extends Racunar {
    private double camera;
    private Mreza mreza;

    public MobilniTelefon() {
    }

    public MobilniTelefon(double camera, Mreza mreza) {
        this.camera = camera;
        this.mreza = mreza;
    }

    public MobilniTelefon(int amountProcessors, int amountRam, int amountGB, double camera, Mreza mreza) {
        super(amountProcessors, amountRam, amountGB);
        this.camera = camera;
        this.mreza = mreza;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        if (camera < 0) {
            this.camera = camera;
        } else {
            System.out.println("Pogresan unos broja megapiksela kamere.");
        }
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return  "Broj procesora: " + amountProcessors +
                ", ram: " + amountRam +
                "GB, memorija: " + amountGB +
                "GB, kamera: " + camera +
                "Megapiksela, mreza: " + mreza;
    }
}
