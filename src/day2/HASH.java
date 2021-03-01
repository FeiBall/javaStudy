package day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HASH {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add(1);
        set.add("a");
        System.out.println(set);

        set.remove(1);
        System.out.println(set);

        System.out.println(set.contains(1));

        set.clear();
        System.out.println(set);

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("d");
        set.add(null);


        System.out.println(set);
        //使用迭代器
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set<String> set1 = new HashSet<String>();
        set1.add("12345");

    }
}
