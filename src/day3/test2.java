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

        Cc<Object> c=new Cc<Object>();
        c.test("xxx");
        //泛型方法在调用之前没有固定的数据类型
        //在调用时，传入的参数是什么类型，就会把泛型改成什么类型
        c.test1(2);//传递的Integer,泛型就固定成Integer，返回值就是Integer
        c.test1(true);


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

class Cc<E>{
    private E e;

    public static void test4(){
        //在静态的方法中不能使用类定义的泛型，如果要使用泛型，只能使用静态方法自己定义的泛型
//        System.out.println(this.e);
    }

    /**
     * 静态方法的泛型方法
     * @param t
     * @param <T>
     */
    public static<T> void test5(T t) {
        System.out.println(t);
    }

    /**
     * 无返回值的泛型方法
     * @param s
     * @param <T>
     */
    public <T> void test(T s){
        //在类上定义的泛型，可以在普通方法中使用
        System.out.println(this.e);
        T t=s;
    }

    public <T> T test1(T s){
        return s;
    }

//    public  void test2(String... strs){
//        for(String s:strs){
//            System.out.println(s);
//        }
//    }

    public <T> void test3(T...strs){
        for(T s:strs){
            System.out.println(s);
        }
    }
}

