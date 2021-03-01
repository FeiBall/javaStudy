package day1;

public class Mankind {
    public Mankind(){
        System.out.println("hello");
    }
    int sex;
    int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrwoman(){
       if(this.sex==0){
           System.out.println("man");
       }
       else{
           System.out.println("woman");
       }
    }
}
