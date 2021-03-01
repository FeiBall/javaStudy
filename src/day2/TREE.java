package day2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TREE {
    public static  void  main(String[] args){
        Set<Integer> set= new TreeSet<Integer>();
        //自然排序
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);
        System.out.println(set);

        set.remove(5);
        System.out.println(set.contains(3));
       // set.clear();

        //迭代器
        Iterator<Integer> it =set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //for each迭代集合，推荐这种

        for(Integer i:set){
            System.out.println(i);
        }
    }
}

