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

    @Override
    public void moveType() {
        System.out.println("走路上学");
    }

    @Override
    public void studyInfo() {
        System.out.println("学习的是中学知识");

    }
}
