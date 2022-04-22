package MapStudy.maptest;

/**
 * @author kinoz
 * @date 2022/4/19 - 18:05
 * @apiNote
 */
class Hero {
    public String name;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
