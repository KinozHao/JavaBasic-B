package b_set;

import java.util.Objects;
//��TreeSet��ΪԪ������ʹ��
public class SetData implements Comparable {
    private String name;
    private int age;

    public SetData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+"->"+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetData stuB = (SetData) o;
        return age == stuB.age &&
                Objects.equals(name, stuB.name);
    }

    @Override
    //��ϣ����HashSet�Ĵ�Ź������к���̵�����
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    //��Ȼ���������
    public int compareTo(Object o) {
        if (o instanceof SetData){
            SetData data = (SetData)o;
            //���ж�����
            int compare = this.name.compareTo(data.name);
            //�������һ��(����Ϊ0����һ��)
            if (compare == 0){
                //ͨ��Integer�ٱȽ�����(�����ȽϾͻ�ֻ��һ������)
                return Integer.compare(this.age,data.age);
            }else {
                return compare;
            }
        }else {
            throw new RuntimeException("�������Ͳ�����");
        }
    }
}
