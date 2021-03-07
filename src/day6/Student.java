package day6;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/7 11:19
 */
public class Student extends Person implements Move,Study {

    String school;

    public void showInfo(){
        System.out.println("学校是："+school);
    }


    public Student(){

    }

    public Student(String school) {
        this.school = school;
    }

    private Student(String name,int age){
        this.name=name;
        this.age=age;
    }


    @Override
    public void moveType() {
        System.out.println("走路上学");
    }

    @Override
    public void studyInfo() {
        System.out.println("学习的是中学知识");

    }

    private void test(String name){
        System.out.println("调用的是私有方法private void test(String name)");
    }

    public String getSchool(){
        return this.school;
    }

    public void setInfo(String school,String name){
        this.school=school;
        this.name=name;
        System.out.println("这是public String setInfo(String school,String name)方法");
    }
}
