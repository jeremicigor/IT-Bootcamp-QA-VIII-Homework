package domaci17z1;

public abstract class Zivotinja {
    protected String name;
    protected String nickname;

    public Zivotinja (){
    }

    public Zivotinja(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public abstract String sound();

    @Override
    public String toString() {
        return "Zivotinja{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
