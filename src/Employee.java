import java.util.*;
import java.util.stream.Stream;

public class Employee {
    int  empNo, age;
    String name, dept,gender;
    double salary;


    public Employee(int empNo, int age, String name, String dept, double salary) {
        this.empNo = empNo;
        this.age = age;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public double getSalary() {
        return salary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }



    public static void main(String[] args) {
        List<Employee> ls=new ArrayList<>();
        Employee e1=new Employee(1,21,"sharad","cs", 20000.99);
        Employee e2=new Employee(2,22,"pavan","cv", 21000.98);
        Employee e3=new Employee(3,23,"rahul","cv", 22000.97);
        Employee e4=new Employee(4,24,"akshata","it", 24000.96);
        Employee e5=new Employee(5,25,"shradha","cs", 25000.95);
        e5.setGender("male");
        Collections.addAll(ls,e1,e2,e3,e4,e5);

        Map<Integer, Employee> mp=new HashMap<>();
        mp.put(1,e1);
        mp.put(2,e2);
        mp.put(3,e3);
        mp.put(4,e4);
        mp.put(5,e5);

        Employee e33=mp.get(1);
        System.out.println(e33);

        //Using ForEach Printing map Key and value
        for (Map.Entry<Integer,Employee> x:mp.entrySet() ) {
            System.out.print(x.getKey()+", ");
            System.out.println(x.getValue());
        }

        System.out.println();
        //Using Stream Printing map Key and values
        mp.entrySet().stream().forEach(i-> System.out.println(i.getKey() + " " + i.getValue()));

        System.out.println();
        System.out.println("if number == 2  donot print");
        mp
                .entrySet()
                .stream()
                .filter(entry->entry.getKey() != 2)
                .forEach(entry-> System.out.println(entry.getKey() +""+entry.getValue()));


        OptionalDouble average = ls.stream().filter(i -> i.getSalary() > 20500).mapToDouble(i->i.getSalary()).average();
        if (average.isPresent()){
            System.out.println(average.getAsDouble());
        }
        OptionalDouble average1 = ls.stream().mapToDouble(i -> i.getAge()).average();
        if (average1.isPresent()){
            System.out.println("Average age is: "+ average1.getAsDouble());
        }

        long count = ls.stream().filter(i -> i.getDept() == "cs").count();
        System.out.println("number of employee present in cs dept is: "+ count);
    }

}
