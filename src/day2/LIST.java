package day2;

import java.util.ArrayList;
import java.util.List;

public class LIST {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("b");//第一个，索引下标为0
        list.add("d");
        list.add("c");//索引下表为2
        list.add("a");
        list.add("a");//可添加重复元素
        System.out.println(list);
        System.out.println(list.get(2));//通过索引来访问指定位置的集合元素

        list.add(1,"f");//在指定索引下标插入数据
        System.out.println(list);

        //在指定位置插入别的集合
        List<String> l=new ArrayList<String>();
        l.add("123");
        l.add("456");
        list.addAll(2,l);//在指定位置插入别的集合
        System.out.println(list);

        System.out.println(list.indexOf("d"));//指定元素在集合中第一次出现的索引下标
        System.out.println(list.lastIndexOf("a"));//指定元素在集合中最后一次出现的索引下标

        list.remove(2);//根据指定索引下标移除数据
        System.out.println(list);

        list.set(1,"ff");//根据指定索引下边改变集合元素
        System.out.println(list);

        List<String> sublist=list.subList(2,5);//根据索引下标起始位置截取一段元素新城一个新的集合---比如这行截取了2~4元素，不包含最后一个索引5
        System.out.println(sublist);

        System.out.println(list.size());//集合长度

        //ArrayList是线程不安全的，Vector是线程安全的，但是不推荐用Vector
    }

}
