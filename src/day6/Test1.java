package day6;

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

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
