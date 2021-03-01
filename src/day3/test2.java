package day3;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/1 15:50
 */
public class test2 {
    public static void main(String[] args) {

        Bl<Object> b1=new Bl();
        Bl<Integer> b=new Bl();//需要指定泛型
        B2 b3=new B2();//不用指定泛型
    }
}

interface IB<T>{
    T test(T t);
}

class Bl<T> implements IB<T>{
    @Override
    public T test(T t) {
        return t;
    }
}


/**
 * 如果实现接口时指定了接口泛型的具体数据类型
 * 这个类实现接口所有方法的位置都要泛型替换实际的具体数据类型
 */
class B2 implements IB<String>{
    @Override
    public String test(String s) {
        return null;
    }
}

