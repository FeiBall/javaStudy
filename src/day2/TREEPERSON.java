package day2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TREEPERSON {
    public static void main(String[] args){
        Person p1=new Person(23,"张三");
        Person p2=new Person(24,"李四");
        Person p3=new Person(21,"王麻子");
        Person p4=new Person(29,"李华");

        Set<Person> set = new TreeSet<Person>(new Person());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);

        for (Person p:set){
            System.out.println(p.name+"  "+p.age);
        }
    }
}

class Person implements Comparator<Person> {//把person对象存到Treeset中并且按照年龄排序

    public Person() {
    }

    public Person(int age,String name) {
        this.name=name;
        this.age=age;
    }

    int age;
    String name;




    @Override
    public  int compare(Person o1,Person o2){
        if(o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}
