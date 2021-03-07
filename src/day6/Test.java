package day6;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/6 23:24
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = p.getClass();//clazz对象中就包含对象p所属的Person类所包含的所有信息

        Class c0=Person.class;//通过类名.class创建指定类的class实例

        Class c1=p.getClass();//通过一个类的实例对象的getClass()方法来获取一个类的class实例

        try {
            //通过Class的静态方法forName(String className)来获取一个类的实例方法
            //参数是你要获取的class实例的类的全路径
            Class c2=Class.forName("day6.Person");//常用方法
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
