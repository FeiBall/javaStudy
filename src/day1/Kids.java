package day1;

public class Kids extends Mankind {
    int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(this.yearsOld);
    }

    public static void main(String[] args){
        Kids kid=new Kids();//建对象，同时调用无参父类构造方法
        kid.setSex(0);
        kid.setSalary(100);
        kid.manOrwoman();


        Mankind e = new Kids();//向上转型

        Mankind d = new Mankind();
        d = new Kids();
//        d.yearsOld=0;//属性是在编译时确定，编译时为Mankind类型，没有yearsOld成员变量，因而编译出错
        //属性是编译时确定，方法是运行时动态确定

        String s="hello";
        Object p=s;
        System.out.println(p);





    }
}
