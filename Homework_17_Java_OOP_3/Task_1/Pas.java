package domaci17z1;

public class Pas extends Zivotinja {
    private boolean goodBoy;


    public Pas() {

    }


    public Pas(String name, String nickname, boolean goodBoy) {
        super(name, nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public String goodBoyTest() {
        if (goodBoy == true) {
            return "I am a good boy";
        } else {
            return "I am a bad boy";
        }
    }

    public String sound() {
        return "woof";
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", nickname=" + nickname +
                ", goodBoy=" + goodBoyTest() +
                ", sound=" + sound();
    }
}
