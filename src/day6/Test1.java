package day6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
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

//            TypeVariable[] paramClazz=clazz.getTypeParameters();


            try {
                Object obj=clazz.newInstance();//相当于调用Student类的无参公有构造函数
                Student stu=(Student)obj;

                Constructor c= clazz.getConstructor(String.class);//指定获取有一个参数并且为String类型的公有的构造方法
                Student stu1=(Student)c.newInstance("第一中学");//构造方法实例化
                System.out.println(stu1.school);

                //通过反射机制，可以强制的调用私有方法
                Constructor c1=clazz.getDeclaredConstructor(String.class,int.class);//指定获取有2个参数的构造方法
                c1.setAccessible(true);//解除私有封装
                Student stu2=(Student)c1.newInstance("张三",12);//私有构造方法实例化
                System.out.println(stu2.name+stu2.age);

            } catch (Exception e) {
                e.printStackTrace();
            }


            try{
//                Method[] ms=clazz.getMethods();//获取到类的所有公有的方法
                Method[] ms=clazz.getDeclaredMethods();//获取到类的所有的方法,包括私有

                for(Method m:ms){
                    System.out.println("方法名"+m.getName());
                    System.out.println("返回值类型"+m.getReturnType());
                    System.out.println("修饰符"+m.getModifiers());

                    Class[] pcs=m.getParameterTypes();//获取方法的参数类型，是一个数组，方法有几个参数，数据就有几个元素
                    if(pcs!=null&&pcs.length>0){
                        for(Class pc:pcs){
                            System.out.println("参数类型"+pc.getName());
                        }
                    }
                    System.out.println("=====================================");
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                Constructor con=clazz.getConstructor();//获取无参构造
                Object obj=con.newInstance();//使用无参构造创建对象

                Method m=clazz.getMethod("setInfo", String.class, String.class);//得到方法名是setInfo，参数类型是String和String的方法
                m.invoke(obj,"Scu","李四");

                //如果想调用私有方法
                Method m1=clazz.getDeclaredMethod("test", String.class);
                m1.setAccessible(true);//解除私有封装
                m1.invoke(obj,"王五");
            }catch (Exception e){
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
