package domaci17z2;

public enum Mreza {
    TRIG("3G"), CETIRIG("4G"), PETG("5G");
    private final String geTip;

    Mreza(String geTip) {
        this.geTip = geTip;
    }

    public String getGeTip() {
        return geTip;
    }
}
