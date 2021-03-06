package day6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/8 19:54
 */

/**
 * 动态代理类
 */
public class ProxyDemo implements InvocationHandler {
    Object obj;//被代理的对象

    public ProxyDemo(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"方法开始执行");

        Object result=method.invoke(this.obj,args);//执行的是指定代理对象的指定的方法

        System.out.println(method.getName()+"方法执行完毕");
        return result;
    }
}
