package domaci17z1;

public class Macka extends Zivotinja {

    private double weight;


    public Macka() {

    }

    public Macka(String name, String nickname, double weight) {
        super(name, nickname);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Maca ne moze imati negativan broj kilograma.");
        }
    }

    public String chonkTest() {
        if (weight > 5) {
            return "I'm a chonk";
        } else if (weight == 5) {
            return "I'm borderline chonk";
        } else {
            return "I'm not a chonk";
        }
    }

    public String sound() {
        return "meow";
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", nickname=" + nickname +
                ", weight=" + weight + "kg" +
                ", weight class=" + chonkTest() +
                ", sound=" + sound();
    }
}
