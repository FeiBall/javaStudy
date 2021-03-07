package day6;

import java.lang.reflect.Constructor;
import java.lang.reflect.TypeVariable;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/7 11:25
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            Class clazz=Class.forName("day6.Student");//通过包名.类名的字符串，调用getName()方法获取指定类的class实例

            Class superClazz=clazz.getSuperclass();//获取父类
            System.out.println(superClazz.getName());

            Class[] interfacesClazz=clazz.getInterfaces();//获取当前类的所有接口
            for(Class c:interfacesClazz){
                System.out.println("接口："+c.getName());
            }

            Constructor[] cons=clazz.getConstructors();//获取公有的构造方法
            for(Constructor c:cons){//数字1代表公有
                System.out.println("构造方法名称"+c.getName()+"的修饰符是："+c.getModifiers());
//                Class[] paramClazz=clazz.getTypeParameters();
            }

            Constructor[] consl=clazz.getDeclaredConstructors();//获取所有的构造方法
            for(Constructor c:consl){//数字2代表private
                System.out.println("构造方法名称"+c.getName()+"的修饰符是："+c.getModifiers());
            }

            TypeVariable[] paramClazz=clazz.getTypeParameters();






        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
