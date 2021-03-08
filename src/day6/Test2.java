package day6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/8 19:49
 */
public class Test2 {
    public static void main(String[] args) {
        ITestDemo test=new TestDemo();//对象多态
        /**
         * 注意：如果一个对象想要通过Proxy.newInstance()方法被代理
         * 那么这个对象的类一定要有相应的接口
         * 就像本类中的ITestDemo接口和实现类TestDemo
         */

        test.test1();
        test.test2();
        /**
         * 现在有一个需求：
         * 在执行test1和test2方法时加入一些东西
         * 在执行方法前打印test1或test2开始执行
         * 在执行方法后打印test1或test2执行完毕
         * 打印的方法要和当前调用的方法保持一致
         */

        InvocationHandler handler=new ProxyDemo(test);

        /**
         * 参数1是代理对象的类加载器
         * 参数2是被代理对象的接口
         * 参数3代理对象
         *
         * 返回的值就是成功被代理后的对象,返回的是Object类型，需要根据情况转换类型
         */
        ITestDemo t=(ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(),test.getClass().getInterfaces(),handler);
        t.test1();
        System.out.println("----------------------");
        t.test2();
    }
}
