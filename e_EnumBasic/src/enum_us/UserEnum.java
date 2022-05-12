package enum_us;

/**
 * @author kinoz
 * @Date 2022/5/12 - 19:29
 * @apiNote
 */
class UserEnum {
    //1.属性私有化
    private final String seasonName;
    private final String seasonDesc;

    //2.构造器私有化,给属性赋值
    private UserEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.对外仅提供常量调用
    public static final UserEnum SPRING = new UserEnum("春天","大地复苏");
    public static final UserEnum SUMMER = new UserEnum("夏天","烈日炎炎");
    public static final UserEnum AUTUMN = new UserEnum("秋天","枫叶飘飘");
    public static final UserEnum WINTER = new UserEnum("冬天","寒风刺骨");

    //4.其他需求,获取属性值,toString方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    @Override
    public String toString() {
        return "Test.Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
