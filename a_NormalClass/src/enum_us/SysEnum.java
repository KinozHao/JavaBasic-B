package enum_us;

/**
 * @author kinoz
 * @Date 2022/5/12 - 19:12
 * @apiNote JDK1.5后使用Enum关键词修饰类
 */
enum SysEnum implements PhoneInfo {
    //1.对外提供常量,去除public static final以及new
    //只保留常量名 每个常量用","隔开 最后一个用";"
    LOW("电量过低",0.15){
        @Override
        public void show() {
            System.out.println("赶紧充电了");
        }
    },
    MEDIUM("电量过半",0.50){
        @Override
        public void show() {
            System.out.println("还能玩2把吃鸡");
        }
    },
    HIGH("电量充足",1){
        @Override
        public void show() {
            System.out.println("晚上之前都不用充电了");
        }
    };

    //2.属性私有化
    private final String ATTENTION_INFO;
    private final double POWER_NUM;

    //3.构造器给属性赋值
    SysEnum(String ATTENTION_INFO, double POWER_NUM) {
        this.ATTENTION_INFO = ATTENTION_INFO;
        this.POWER_NUM = POWER_NUM;
    }

    //4.其他需求,获取属性值,toString方法
    public String getATTENTION_INFO() {
        return ATTENTION_INFO;
    }

    public double getPOWER_NUM() {
        return POWER_NUM;
    }

    @Override
    public String toString() {
        return "EnumBasicII{" +
                "ATTENTION_INFO='" + ATTENTION_INFO + '\'' +
                ", POWER_NUM=" + POWER_NUM +
                '}';
    }

    @Override
    public void show() {
        System.out.println("关于手机电量对应的提示");
    }
}
