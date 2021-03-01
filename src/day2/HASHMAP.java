package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/2/28 15:01
 */
public class HASHMAP {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put("b",1);
        map.put("c",2);
        map.put("e",2);
        System.out.println(map);
        System.out.println(map.get("b"));//根据key取值

        map.remove("c");//根据key移除键值对
        System.out.println(map);

        System.out.println(map.size());//长度
        System.out.println(map.containsKey("a"));//判断当前集合是否含有指定key
        System.out.println(map.containsValue(10));
        //map.clear();
        Set<String> keys=map.keySet();//获取map集合的key集合
        map.values();//获取集合的所有value值

        //遍历map集合,通过map.keySet();
        for(String key:keys){
            System.out.println("key:"+key+",value:"+map.get(key));
        }

        //通过map.entrySet(;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer>en:entries){
            System.out.println("key:"+en.getKey()+",value:"+en.getValue());
        }


    }
}
