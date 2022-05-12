package enum_us;

/**
 * @author kinoz
 * @Date 2022/5/12 - 19:29
 * @apiNote
 */
class UserEnum {
    //1.����˽�л�
    private final String seasonName;
    private final String seasonDesc;

    //2.������˽�л�,�����Ը�ֵ
    private UserEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.������ṩ��������
    public static final UserEnum SPRING = new UserEnum("����","��ظ���");
    public static final UserEnum SUMMER = new UserEnum("����","��������");
    public static final UserEnum AUTUMN = new UserEnum("����","��ҶƮƮ");
    public static final UserEnum WINTER = new UserEnum("����","����̹�");

    //4.��������,��ȡ����ֵ,toString����
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
