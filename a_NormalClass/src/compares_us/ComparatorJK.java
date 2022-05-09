package compares_us;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author kinoz
 * @Date 2022/5/9 - 21:23
 * @apiNote Comparator�����ڲ�Ӱ��ԭ�����compareTo()�����Ļ�����
 * ��дһ���µĹ���������
 */
public class ComparatorJK {
    String[] str = new String[]{"a","c","b","k","m","n","c"};

    @Test
    public void String_test(){
        Arrays.sort(str, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String str1 = (String)o1;
                    String str2 = (String)o2;
                    //�Ӵ�С��������
                    return -str1.compareTo(str2);
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(str));
    }
    @Test
    public void Goods_test(){
        Goods[] goods = new Goods[6];
        goods[0] = new Goods("XiaoXinAir:",34);
        goods[1] = new Goods("LogicG302:",43);
        goods[2] = new Goods("RazerV2:",12);
        goods[3] = new Goods("HuaweiAir:",65);
        goods[4] = new Goods("HP1230s:",43);
        goods[5] = new Goods("HP1230s:",39.99);


        //���ղ�Ʒ���ƴӵ͵��ߣ��ٰ��ռ۸�Ӹߵ���
        //sortΪ����new Comparator����Ϊ�������
        Arrays.sort(goods,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods){
                    Goods goods1 = (Goods)o1;
                    Goods goods2 = (Goods)o2;
                    //1����Ʒ������ͬ
                    if (goods1.getName().equals(goods2.getName())){
                        //2��Ʒ�۸�Ӹߵ�������
                        return -Double.compare(goods1.getPrice(),goods2.getPrice());
                    }else {
                        //3���Ʋ�ͬʱ����Ʒ�۸�Ӹߵ���
                        return goods1.getName().compareTo(goods2.getName());
                    }
                }
                throw new RuntimeException("���Ͳ�һ��");
            }

        });
        System.out.println(Arrays.toString(goods));
    }
}
