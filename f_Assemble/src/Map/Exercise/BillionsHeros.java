package Map.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BillionsHeros {
    public static void main(String[] args) {
        // TODO �Զ����ɵķ������
        ArrayList<Hero> al=new ArrayList<>();
        //��������
        for(int i=0;i<3000000;i++)
        {
            int hp=(int)(Math.random()*8999+1000);
            al.add(new Hero("Hero-"+hp));
        }


        //forѭ��
        long time1=System.currentTimeMillis();
        List<Hero> l=new ArrayList<>();
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).name.equals("Hero-5555"))
                l.add(al.get(i));
        }
        long time2=System.currentTimeMillis();
        System.out.println("�ҵ���"+l.size()+"��"+"\t��ʱ��"+(time2-time1));


        //HashMsp
        HashMap<String,List<Hero>> hm=new HashMap<>();
        for(Hero h:al)
        {
            List<Hero> ll=hm.get(h.name);
            if(ll==null)
            {
                ll=new ArrayList<>();
                hm.put(h.name,ll);
            }
            ll.add(h);
        }
        List<Hero> ll=hm.get("Hero-5555");
        long time3=System.currentTimeMillis();
        System.out.println("�ҵ���"+ll.size()+"��"+"\t��ʱ��"+(time3-time2));
    }

}

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
