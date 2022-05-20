package b_list.list_test;

import z_tools.CollTraver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author kinoz
 * @Date 2022/5/20 - 20:00
 * @apiNote 去除ArrayList中的重复数据
 */
public class duplicateNum {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(111);
        arr.add(111);
        arr.add(111);
        arr.add(111);
        arr.add(2000);

        //通过HashSet底层的判别方法直接去除重复数据
        HashSet hashSet = new HashSet();
        hashSet.addAll(arr);
        CollTraver.IteratorTravers(hashSet);
    }
}

