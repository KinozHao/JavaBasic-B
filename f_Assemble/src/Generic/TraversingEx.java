package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversingEx {
    public static void main(String[] args) {
//        ForPlus();
        List<LegendOfLegens> hero=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            hero.add(new LegendOfLegens("names"+i));
        }
        Iterator<LegendOfLegens> in=hero.iterator();
        while (in.hasNext()){
            LegendOfLegens is=in.next();
            int i=Integer.parseInt(is.toString().split(" ")[1]);
            if (i % 8==0 && i!= 0){
                in.remove();
            }
        }
        Iterator<LegendOfLegens> zn=hero.iterator();
        while (zn.hasNext()){
            System.out.println(zn.next().toString());
        }
    }

    private static void ForPlus() {
        List<LegendOfLegens> heros=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            heros.add(new LegendOfLegens("hero name " + i));
        }

        List<LegendOfLegens> Dleheros=new ArrayList<>();

        for (LegendOfLegens h:heros){
            int id=Integer.parseInt(h.name.substring(1));

            if(id%8 ==0) {
                Dleheros.add(h);
            }
        }
        for (LegendOfLegens h : Dleheros){
            heros.remove(h);
        }
        System.out.println(heros);
    }
}
