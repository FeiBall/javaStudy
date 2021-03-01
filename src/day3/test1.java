package day3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/2/28 18:48
 */
public class test1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(111);
        list.add("asd");
        list.add(true);

        List<String> l=new ArrayList<String>();
        l.add("xxx");

    }
}

/**
 * 此处的泛型Type随便取任何名字，A,B,V等等
 * @param <T>
 */
class A<T>{
    private T key;
    public  void setKey(T key){
        this.key=key;
    }

    public T getKey(){
        return this.key;
    }
}
