package service;

/**
 * @author kinoz
 * @date 2022/4/23 - 19:20
 * @apiNote 员工的状态类(枚举类的体现)
 */
public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public static final Status Free = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }
}
