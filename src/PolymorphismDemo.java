class person{
    void behaviour(){
        System.out.println("show different bahaviours");
    }
}
class husband extends person{
    void behaviour(){
        System.out.println("he is husband as per the need of his wife he behaves");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        husband hb=new husband();
        hb.behaviour();
    }
}
