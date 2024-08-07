import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StudentDetails {
    int age;
    String name;
    String usn;

    StudentDetails(int age, String name, String usn){
        this.age=age;
        this.name=name;
        this.usn=usn;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", usn='" + usn + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }

    public static void main(String[] args) {
        List<StudentDetails>  ls=new ArrayList<>();
        StudentDetails s1=new StudentDetails(21, "pradyumn", "R17cs301");
        StudentDetails s2=new StudentDetails(22, "prmod", "R18cs302");
        StudentDetails s3=new StudentDetails(23, "nitin", "R19cs303");
        StudentDetails s4=new StudentDetails(24, "praveen", "R20cs304");
        StudentDetails s5=new StudentDetails(25, "sachin", "R17cs305");
        Collections.addAll(ls, s1,s2,s3,s4,s5);

        System.out.println(ls);
        StudentDetails studentDetails = ls.stream().filter(i -> i.getAge() == 23).findFirst().get();
        System.out.println(studentDetails);
        StudentDetails studentDetails1 = ls
                                            .stream()
                                            .filter(i -> i.getUsn() == "R17cs301")
                                            .findAny()
                                            .get();
        System.out.println(studentDetails1);
        Integer lss2 = ls
                        .stream()
                        .filter(i -> i.getName() == "nitin")
                        .map(i -> i.age + 5)
                        .findFirst()
                        .get();
        System.out.println("age addition in nitin"+lss2);

        Integer ls3 = ls
                .stream()
                .filter(i -> i.getName() == "Prateek")
                .map(i -> i.getAge() + 6)
                .findAny().orElse(0);

//        if(any.isPresent()){
//            System.out.println("age addition in prateek"+any.get());
//        }
        System.out.println("age addition in prateek"+ls3);

        Optional<String> first = ls.stream().filter(i -> i.getAge() == 25).map(i -> i.getName()).findFirst();
        if(first.isPresent()){
            System.out.println(first);
        }

        long count = ls.stream().filter(i -> i.getAge() > 20).count();
        System.out.println(count);
    }
}
