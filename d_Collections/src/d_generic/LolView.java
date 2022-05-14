package d_generic;

public class LolView {
    String name;
    String weapon;

    public LolView(String name) {
        this.name = name;
    }

    public LolView(String name,String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "LolView{" +
                "Ó¢ÐÛÃû³Æ='" + name + '\'' +
                ", ÎäÆ÷='" + weapon + '\'' +
                '}';
    }


}
