package b_list.list_test;

import z_tools.CollTraver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author kinoz
 * @Date 2022/5/20 - 20:00
 * @apiNote ȥ��ArrayList�е��ظ�����
 */
public class duplicateNum {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(111);
        arr.add(111);
        arr.add(111);
        arr.add(111);
        arr.add(2000);

        //ͨ��HashSet�ײ���б𷽷�ֱ��ȥ���ظ�����
        HashSet hashSet = new HashSet();
        hashSet.addAll(arr);
        CollTraver.IteratorTravers(hashSet);
    }
}

