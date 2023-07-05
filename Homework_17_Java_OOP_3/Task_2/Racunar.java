package domaci17z2;

/*
Računar ima broj procesora, količinu ram memorije i količinu memorije.
Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB"
 */

public class Racunar {
    protected int amountProcessors;
    protected int amountRam;
    protected int amountGB;

    public Racunar() {

    }

    public Racunar(int amountProcessors, int amountRam, int amountGB) {
        this.amountProcessors = amountProcessors;
        this.amountRam = amountRam;
        this.amountGB = amountGB;
    }

    public int getAmountProcessors() {
        return amountProcessors;
    }

    public void setAmountProcessors(int amountProcessors) {
        if (amountProcessors > 0) {
            this.amountProcessors = amountProcessors;
        } else {
            System.out.println("Racunar ne moze imati negativan broj procesora.");
        }
    }

    public int getAmountRam() {
        return amountRam;
    }

    public void setAmountRam(int amountRam) {
        if (amountRam > 0) {
            this.amountRam = amountRam;
        } else {
            System.out.println("Pogresan unos ram-a.");
        }
    }

    public int getAmountGB() {
        return amountGB;
    }

    public void setAmountGB(int amountGB) {
        if (amountGB > 0) {
            this.amountGB = amountGB;
        } else {
            System.out.println("Pogresan unos GB");
        }
    }

    @Override
    public String toString() {
        return "Racunar{" +
                "Broj procesora: " + amountProcessors +
                ", ram: " + amountRam +
                "GB, memorija: " + amountGB + "GB" +
                '}';
    }
}