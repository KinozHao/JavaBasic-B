package enum_us;

/**
 * @author kinoz
 * @Date 2022/5/12 - 19:12
 * @apiNote JDK1.5��ʹ��Enum�ؼ���������
 */
enum SysEnum implements PhoneInfo {
    //1.�����ṩ����,ȥ��public static final�Լ�new
    //ֻ���������� ÿ��������","���� ���һ����";"
    LOW("��������",0.15){
        @Override
        public void show() {
            System.out.println("�Ͻ������");
        }
    },
    MEDIUM("��������",0.50){
        @Override
        public void show() {
            System.out.println("������2�ѳԼ�");
        }
    },
    HIGH("��������",1){
        @Override
        public void show() {
            System.out.println("����֮ǰ�����ó����");
        }
    };

    //2.����˽�л�
    private final String ATTENTION_INFO;
    private final double POWER_NUM;

    //3.�����������Ը�ֵ
    SysEnum(String ATTENTION_INFO, double POWER_NUM) {
        this.ATTENTION_INFO = ATTENTION_INFO;
        this.POWER_NUM = POWER_NUM;
    }

    //4.��������,��ȡ����ֵ,toString����
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
        System.out.println("�����ֻ�������Ӧ����ʾ");
    }
}
