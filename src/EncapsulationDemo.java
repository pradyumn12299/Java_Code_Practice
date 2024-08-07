class Person{
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(24);
        System.out.println("Age is: "+ p1.getAge());
    }
}
